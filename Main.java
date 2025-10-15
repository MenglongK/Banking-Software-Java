package kh.edu.istad.classandobject.oop.inheritance.bankaccount;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // use special super()
        SavingAccount savingAccount = new SavingAccount("7777", "MENGLONG", BigDecimal.valueOf(5000), LocalDate.of(2023, 10, 10), 7);

        PayrollAccount payrollAccount = new PayrollAccount("8888", "CHAN CHHAYA", BigDecimal.valueOf(0), LocalDate.of(2023, 10, 10), 20);

        Card cardATM = new Card(7777,BigDecimal.valueOf(1000),LocalDate.of(2026, 10, 10));
        /*
        cardATM.pin = 7777;
        cardATM.overlimit = BigDecimal.valueOf(1000);
        cardATM.expiredAt = LocalDate.of(2026, 10, 10);
        **/

        // use normal super
        /*
        savingAccount.actNo = "88889999";
        savingAccount.actName = "CHAN CHHAYA";
        savingAccount.balance = BigDecimal.valueOf(15);
        savingAccount.createdAt = LocalDate.of(2020, 10, 10);
        savingAccount.interestRate = 7;
        **/

        do {
            ATM option = new ATM();
            option.option();
            System.out.println("---------------------------");
            System.out.print("Enter option: ");
            int opt = Integer.parseInt(scanner.nextLine());
            System.out.println("---------------------------");
            switch (opt) {
                case 1 -> {
                    do {
                        ATM display = new ATM();
                        display.display("Saving account");
                        System.out.println("---------------------------");
                        System.out.print("Enter option: ");
                        int optSaving = Integer.parseInt(scanner.nextLine());
                        System.out.println("---------------------------");

                        switch (optSaving) {
                            case 1 -> {
                                System.out.print("Enter amount: ");
                                double amount = Double.parseDouble(scanner.nextLine());
                                savingAccount.deposit(BigDecimal.valueOf(amount));
                            }
                            case 2 -> {
                                System.out.print("Enter amount: ");
                                double amount = Double.parseDouble(scanner.nextLine());
                                savingAccount.withdrawal(BigDecimal.valueOf(amount));
                            }
                            case 3 -> {
                                savingAccount.checkBalance();
                                System.out.println("---------------------------");
                            }
                            case 0 -> {
                                System.out.println("Exit the program..!");
                                System.exit(0);
                            }
                        }
                    } while (true);
                }
                case 2 -> {
                    do {
                        ATM display = new ATM();
                        display.display("Payroll account");
                        System.out.print("Enter option: ");
                        int optPayroll = Integer.parseInt(scanner.nextLine());
                        System.out.println("---------------------------");

                        switch (optPayroll) {
                            case 1 -> {
                                System.out.print("Enter amount: ");
                                double amount = Double.parseDouble(scanner.nextLine());
                                payrollAccount.deposit(BigDecimal.valueOf(amount));
                            }
                            case 2 -> {
                                System.out.print("Enter amount: ");
                                double amount = Double.parseDouble(scanner.nextLine());
                                payrollAccount.withdrawal(BigDecimal.valueOf(amount));
                            }
                            case 3 -> {
                                payrollAccount.checkBalance();
                                System.out.println("---------------------------");
                            }
                            case 0 -> {
                                System.out.println("Exit the program..!");
                                System.exit(0);
                            }
                        }
                    } while (true);
                }
                case 3 -> {
                    cardATM.expiredAtValidation();
                    cardATM.inputPin();
                    do {
                        ATM card = new ATM();
                        card.display("Saving Card");
                        System.out.println("---------------------------");
                        System.out.print("Enter option: ");
                        int optATM = Integer.parseInt(scanner.nextLine());
                        switch (optATM) {
                            case 1 -> {
                                System.out.println("---------------------------");
                                System.out.print("Enter amount: ");
                                double amount = Double.parseDouble(scanner.nextLine());
                                savingAccount.deposit(BigDecimal.valueOf(amount));
                            }
                            case 2 -> {
                                System.out.println("---------------------------");
                                System.out.print("Enter amount: ");
                                double amount = Double.parseDouble(scanner.nextLine());
                                if (cardATM.overlimit.compareTo(BigDecimal.valueOf(amount)) < 0 && savingAccount.balance.compareTo(BigDecimal.valueOf(amount)) > 0) {
                                    System.out.println("---------------------------");
                                    System.out.println("You have to withdraw below " + cardATM.overlimit);
                                    System.out.println("---------------------------");
                                    break;
                                }
                                savingAccount.withdrawal(BigDecimal.valueOf(amount));
                            }
                            case 3 -> {
                                savingAccount.checkBalance();
                                System.out.println("---------------------------");
                            }
                            case 0 -> System.exit(0);
                        }
                    } while (true);
                }
                case 0 -> {
                    System.out.println("Exit the program..!");
                    System.exit(0);
                }
            }
        } while (true);


    }
}
