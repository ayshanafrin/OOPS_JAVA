package cycle1;
    
public class BankAccount {
         
    String accountNumber;
    String accountHolder;
    Double balance;


public BankAccount(String accNumber, String accHolder, Double bal)
{
     accountNumber = accNumber ;
     accountHolder = accHolder;
     balance = bal ;
}

void deposit(double amount){
     if (amount > 0) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    } else {
        System.out.println("Invalid deposit amount.");
     }
}

void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    } else {
        System.out.println("Insufficient funds Money cant be Withraw.");
    }
}

void displayAccountInfo() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Holder: " + accountHolder);
    System.out.println("Balance: $" + balance);
}


public static void main(String[] args) {
    BankAccount acc = new BankAccount("789367", "Aasiya S", 10000.0);

    acc.displayAccountInfo();
    acc.deposit(5000);
    acc.withdraw(1000);
    acc.withdraw(15000);  
    acc.displayAccountInfo();
}
}


