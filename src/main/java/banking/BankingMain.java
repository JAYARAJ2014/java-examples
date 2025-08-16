package banking;

import java.util.Scanner;

public class BankingMain {

    static Scanner scanner = new Scanner(System.in);
    public static void runBanking() {


        double balance = 0;
        int choice ;
        boolean isRunning = true;

        while(isRunning ) {

            System.out.println("*****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*****************");
            System.out.println("1. Balance Inquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************");

            System.out.print("Enter your choice (1 - 4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    showBalance(balance);
                }
                case 2 -> {
                    System.out.print("Deposit");
                    balance += deposit();
                }
                case 3 -> {
                    System.out.println("Withdraw");
                    balance= balance - withdraw();
                }
                case 4 ->{
                    isRunning =false;
                    scanner.close();
                }
                default ->  {
                    System.out.println("INVALID CHOICE");
                    scanner.close();
                }
            }
        }
    }

public static void showBalance(double balance) {
    System.out.println("*****************");
    System.out.printf("You have $%.2f in your account.\n", balance);
}
 public  static double deposit(){

     System.out.print("How much do you want to deposit: ");
     var amount = scanner.nextDouble();
     if(amount<=0){
         System.out.println("Nah! That's not right");
         return  0;
     }
     return amount;
 }
    public static double withdraw(){

        System.out.print("How much do you want to withdraw: ");
        return scanner.nextDouble();
    }


}
