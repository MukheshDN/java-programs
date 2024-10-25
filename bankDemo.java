import java.util.Scanner;

class Account {
   String name;
   int accountNumber;
   String type;

   Account(String name, int accountNumber, String type) {
       this.name = name;
       this.accountNumber = accountNumber;
       this.type = type;
   }
}

class SavAccount extends Account {
   int amount = 0;
   int interest;

   SavAccount(String name, int accountNumber, String type, int interest) {
       super(name, accountNumber, type);
       this.interest = interest;
   }

   void addBalance_S(int amount) {
       this.amount += amount;
       this.amount += (amount * interest) / 100;
   }

   void withdraw_s(int am) {
       if (amount >= am) {
           System.out.println("Withdraw successful");
           amount -= am;
           System.out.println("The balance is " + amount);
       } else {
           System.out.println("Insufficient balance");
       }
   }

   void displayBalance_s() {
       System.out.println("The balance is " + amount);
   }
}

class CurAccount extends Account {
   int serviceCharge = 50;
   int minBalance = 5000;
   int cAmount = 0;

   CurAccount(String name, int accountNumber, String type) {
       super(name, accountNumber, type);
   }

   void addBalance_c(int amount) {
       this.cAmount += amount;
       if (cAmount < minBalance) {
           System.out.println("Amount deducted due to insufficient balance");
           cAmount -= serviceCharge;
       }
   }

   void withdraw_c(int am) {
       if (cAmount >= am) {
           System.out.println("Withdraw successful");
           cAmount -= am;
           System.out.println("The balance is " + cAmount);

           if (cAmount < minBalance) {
               System.out.println("Amount deducted due to insufficient balance");

               cAmount -= serviceCharge;
           }
       } else {
           System.out.println("Insufficient balance");
       }
   }

   void displayBalance_c() {
       System.out.println("The balance is " + cAmount);
   }
}
 class bankDemo {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter which type of bank account you want to open:");
       System.out.println("Enter 1 for Savings Account or 2 for Current Account");

       int n = sc.nextInt();
       sc.nextLine();  // Consume the newline

       if (n == 1) {
           System.out.print("Enter your name: ");
           String name = sc.nextLine();
           System.out.print("Enter your account number: ");
           int accountNumber = sc.nextInt();
           System.out.print("Enter the interest rate: ");
           int interestPercentage = sc.nextInt();

           SavAccount s1 = new SavAccount(name, accountNumber, "Savings Account", interestPercentage);
           String ans = "y";

           while (ans=="y" || ans=="Y") {
               System.out.println("Enter 1 to Add Balance, 2 to Withdraw, or 3 to Display Balance:");
               int choice = sc.nextInt();

               switch (choice) {
                   case 1 -> {
                       System.out.print("Enter the amount to add: ");
                       int am = sc.nextInt();
                       s1.addBalance_S(am);
                   }
                   case 2 -> {
                       System.out.print("Enter the amount to withdraw: ");
                       int am = sc.nextInt();
                       s1.withdraw_s(am);
                   }
                   case 3 -> s1.displayBalance_s();
                   default -> System.out.println("Please enter a valid choice");
               }

               System.out.print("Enter 'y' to continue or 'n' to exit: ");
               ans = sc.next();
           }
       } else if (n == 2) {
           System.out.print("Enter your name: ");
           String name = sc.nextLine();
           System.out.print("Enter your account number: ");
           int accountNumber = sc.nextInt();

           CurAccount c1 = new CurAccount(name, accountNumber, "Current Account");
           String ans = "y";

           while (ans=="y" || ans=="Y") {
               System.out.println("Enter 1 to Add Balance, 2 to Withdraw, or 3 to Display Balance:");
               int choice = sc.nextInt();

               switch (choice) {
                   case 1 -> {
                       System.out.print("Enter the amount to add: ");
                       int am = sc.nextInt();
                       c1.addBalance_c(am);
                   }
                   case 2 -> {
                       System.out.print("Enter the amount to withdraw: ");
                       int am = sc.nextInt();
                       c1.withdraw_c(am);
                   }
                   case 3 -> c1.displayBalance_c();
                   default -> System.out.println("Please enter a valid choice");
               }

               System.out.print("Enter 'y' to continue or 'n' to exit: ");
               ans = sc.next();
           }
       } else {
           System.out.println("Invalid option chosen.");
       }

       sc.close();
   }
}
