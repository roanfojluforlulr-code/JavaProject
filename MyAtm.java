import java.util.Scanner;

public class MyAtm {
        public float balance = 1000;
        public boolean all_flag = false;

        // login function
        public static boolean login() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please enter the user name: ");
                String inputUsername = scanner.next();

                System.out.print("Please enter the password: ");
                String firstPassword = scanner.next();

                System.out.print("Please enter the password again: ");
                String secondPassword = scanner.next();

                if (firstPassword.equals(secondPassword)) {
                        System.out.println("Login successfully!");
                        System.out.println("-------------------");
                        return true;
                } else {
                        System.out.println("The passwords do not match.");
                }
                return false;
        }

        // View balance
        public void checkBalance() {
                System.out.println("-------------------");
                System.out.println("Your balance is: " + balance);
                System.out.println("-------------------");
        }

        // deposit
        public void deposit() {

                Scanner scanner = new Scanner(System.in);
                float money = 0;
                boolean flag = false;

                while (!flag) {
                        System.out.print("Please enter how much you want to deposit: ");
                        if (scanner.hasNextFloat()) {
                                money = scanner.nextFloat();
                                if (money > 0) {
                                        flag = true;
                                } else {
                                        System.out.println("Invalid deposit amount, must be positive.");
                                }
                        } else {
                                System.out.println("Invalid input, please enter a valid number.");
                                scanner.next(); // Consume the invalid input
                        }
                }

                balance += money;
                System.out.println("-------------------");
                System.out.println("Deposit successful, current balance is: " + balance);
                System.out.println("-------------------");
        }

        // withdraw
        public void withdraw() {
                Scanner scanner = new Scanner(System.in);
                float money = 0;
                boolean flag = false;

                while (!flag) {
                        System.out.print("Please enter the withdrawal amount: ");
                        if (scanner.hasNextFloat()) {
                                money = scanner.nextFloat();
                                if (money > 0 && money <= balance) {
                                        flag = true;
                                } else if (money > balance) {
                                        System.out.println("Insufficient balance.");
                                } else {
                                        System.out.println("Invalid withdrawal amount, must be positive.");
                                }
                        } else {
                                System.out.println("Invalid input, please enter a valid number.");
                                scanner.next();
                        }
                }
                balance -= money;
                System.out.println("-------------------");
                System.out.println("Withdrawal successful, remaining balance is: " + balance);
                System.out.println("-------------------");
        }

        public static void main(String[] args) {
                MyAtm atm = new MyAtm();
                Scanner scanner = new Scanner(System.in);

                System.out.println("Welcome to use ATM!");

                // login
                if (!login()) {
                        System.out.println("-------------------");
                        System.out.println("Login failed, program ends.");
                        System.out.println("-------------------");
                        return;
                }

                boolean exit = false;

                // main menu
                while (!exit) {
                        System.out.println("Please choose your operation:");
                        System.out.println("1. View balance");
                        System.out.println("2. Deposit");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Exit");
                        System.out.print("Please enter the operation you want: ");

                        int choice = 0;
                        boolean flag = false;

                        while (!flag) {
                                if (scanner.hasNextInt()) {
                                        choice = scanner.nextInt();
                                        if (choice >= 1 && choice <= 4) {
                                                flag = true;
                                        } else {
                                                System.out.println("Invalid option, please try again.");
                                        }
                                } else {
                                        System.out.println("Invalid input, please enter a number between 1 and 4.");
                                        scanner.next();
                                }
                        }

                        switch (choice) {
                                case 1:
                                        atm.checkBalance();
                                        break;
                                case 2:
                                        atm.deposit();
                                        break;
                                case 3:
                                        atm.withdraw();
                                        break;
                                case 4:
                                        exit = true;
                                        System.out.println("-------------------");
                                        System.out.println("Thanks for using the ATM. Bye!");
                                        break;
                                default:
                                        System.out.println("Invalid option, please try again.");
                        }
                }
                scanner.close();
        }
}