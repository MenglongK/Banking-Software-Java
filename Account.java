package kh.edu.istad.classandobject.oop.inheritance.bankaccount;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Account {
    String actNo, actName;
    BigDecimal balance;
    LocalDate createdAt;

    public Account() {
    }
    ;

    public Account(String actNo, String actName, BigDecimal balance, LocalDate createdAt) {
        this.actNo = actNo;
        this.actName = actName;
        this.balance = balance;
        this.createdAt = createdAt;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Invalid amount..!");
            return;
        }
        balance = balance.add(amount);
    }

    public void withdrawal(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Amount must be bigger than ZERO");
            return;
        }
        if (amount.compareTo(balance) > 0) {
            System.out.println("Insufficinet balance..!");
            return;
        }
        System.out.println("--------------------");
        balance = balance.subtract(amount);
        System.out.println("Withdraw successfully!!!");
    }

    public void checkBalance() {
        System.out.println("Account balance: " + balance);
    }
}
