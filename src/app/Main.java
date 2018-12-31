package app;

public class Main {
    public static void main(String[] args) {
        BankAccount subject1 = new BankAccount();
        subject1.setNumAccount(1111);
        subject1.setOwner("Eduardo");
        subject1.openAccount("CA");

        BankAccount subject2 = new BankAccount();
        subject2.setNumAccount(1112);
        subject2.setOwner("Laura");
        subject2.openAccount("SO");

        subject1.deposit(100);
        subject2.deposit(500);

        subject2.withdraw(45);

        subject1.currentStatus();
        subject2.currentStatus();
    }
}