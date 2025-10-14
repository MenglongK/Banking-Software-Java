package kh.edu.istad.classandobject.oop.inheritance.bankaccount;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class PayrollAccount extends Account {
    float taxRate; // 20%

    public PayrollAccount(String actNo, String actName, BigDecimal balance, LocalDate createdAt, float taxRate) {
        super(actNo, actName, balance, createdAt);
        this.taxRate = taxRate;
    }

    @Override
    public void deposit(BigDecimal amount) {
        super.deposit(amount);
        if (amount.compareTo(BigDecimal.ZERO)>0) {
            balance = balance.subtract(amount.multiply(BigDecimal.valueOf(taxRate / 100))).setScale(2, RoundingMode.FLOOR);
        }
    }

    @Override
    public void withdrawal(BigDecimal amount) {
        super.withdrawal(amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Tax rate: " + taxRate);
        super.checkBalance();
    }
}
