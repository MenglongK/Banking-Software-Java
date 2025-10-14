package kh.edu.istad.classandobject.oop.inheritance.bankaccount;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

public class SavingAccount extends Account {
    float interestRate;
    Card card;

    // use super()
    public SavingAccount(String actNo, String actName, BigDecimal balance, LocalDate createdAt, float interestRate) {
        super(actNo, actName, balance, createdAt);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(BigDecimal amount) {
        super.deposit(amount);
    }

    @Override
    public void withdrawal(BigDecimal amount) {
        super.withdrawal(amount);
    }

    public BigDecimal calculateInterest() {
        int year = Period.between(createdAt, LocalDate.now()).getYears();
        if (year > 1) {
            return balance.multiply(BigDecimal.valueOf(interestRate / 100)).setScale(3, RoundingMode.FLOOR);
        } else {
            return BigDecimal.ZERO;
        }
    }

    @Override
    public void checkBalance() {
        super.checkBalance();
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Interest: " + calculateInterest());
    }
}