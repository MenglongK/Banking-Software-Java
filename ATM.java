package kh.edu.istad.classandobject.oop.inheritance.bankaccount;

public class ATM {
    public void display(String msg) {
        System.out.println("Welcome to " + msg);
        System.out.println("---------------------------");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Check balance");
        System.out.println("0. Exit");
    }

    public void option() {
        System.out.println("--------------------");
        System.out.println("Welcome to Wife Bank");
        System.out.println("--------------------");
        System.out.println("1. Saving account");
        System.out.println("2. Payroll account");
        System.out.println("3. Card");
        System.out.println("0. Exit");
    }
}
