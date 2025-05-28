import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;

        System.out.println("*^*^*^*^**^*^*^*^*^*^*^*^*^**^*^*^*^**^*^*^*^*^*^*^*^*^*");
        System.out.println("### Welcome to Expanse Bank!!");
        System.out.println("*^*^*^*^**^*^*^*^*^*^*^*^*^**^*^*^*^**^*^*^*^*^*^*^*^*^*");

        while (isRunning) {
            System.out.println("\nChoose any option from Below:");
            System.out.println("1. Deposit");
            System.out.println("2. Show Balance");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choose = input.nextInt();
            System.out.println("*^*^*^*^**^*^*^*^*^*^*^*^*^**^*^*^*^**^*^*^*^*^*^*^*^*^*");

            switch (choose) {
                case 1:
                    System.out.println("Welcome to Deposition World!!");
                    System.out.print("Please enter the amount to be deposited(in $): ");
                    double depositAmount = input.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Your amount has been deposited safely!!");
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;

                case 2:
                    System.out.println("Welcome to the world of Show-Balance!!");
                    System.out.printf("Here is your Balance amount:$%.2f%n", balance);
                    break;

                case 3:
                    System.out.println("Welcome to the World Of Withdrawal!!");
                    System.out.print("Enter the amount to withdraw(in $): ");
                    double withdrawAmount = input.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance!");
                    } else if (withdrawAmount > 0) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Invalid withdrawal amount!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for Coming! Hope You have a wonderful day!!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid Input!! Try Again!!");
            }

            System.out.println("*^*^*^*^**^*^*^*^*^*^*^*^*^**^*^*^*^**^*^*^*^*^*^*^*^*^*");
        }

        input.close(); // Always close Scanner
    }
}
