package kh.edu.istad.classandobject.oop.inheritance.bankaccount;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Card {
    int pin; // check pin
    BigDecimal overlimit; // under 1000
    LocalDate expiredAt; // validate just join in deposit (your card has expired)

    public void expiredAtValidation() {
        LocalDate today = LocalDate.now();
        if (today.isAfter(expiredAt)) {
            System.out.println("---------------------------");
            System.out.println("Your card is expired..!");
            System.out.println("---------------------------");
            System.exit(0);
        }
    }

    public void inputPin() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter PIN: ");
            int inputPin = Integer.parseInt(scanner.nextLine());
            if (inputPin != pin) {
                System.out.println("---------------------------");
                System.out.println("Your PIN is incorrect..!");
                System.out.println("---------------------------");
            }else {
                System.out.println("---------------------------");
                System.out.println("You login successfully!");
                System.out.println("---------------------------");
                break;
            }
        }while (true);
    }
}
