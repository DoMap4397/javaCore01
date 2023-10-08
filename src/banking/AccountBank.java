package banking;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountBank {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;

    //    input format
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0,00");

    //    constructor
    public AccountBank(int customerNumber, int pinNumber) {
        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
    }

    public AccountBank(int customerNumber, int pinNumber, double checkingBalance, double savingBalance) {
    }

    public double calcCheckingWithDraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    //    check withdraw money
    public void getCheckingWithdrawInput() {
        boolean flag = false;
        while (!flag) {
            try {
                System.out.println("Current account balance: " + moneyFormat.format(checkingBalance));
                System.out.println("\nAccount you want to withdraw: ");
                double amount = input.nextDouble();
                if ((checkingBalance - amount) >= 0 && amount >= 0) {
                    //  calcCheckingWithDraw
                    calcCheckingWithDraw(amount);
                    System.out.println("Current balance: " + moneyFormat.format(checkingBalance));
                    flag = true;
                } else {
                    System.out.println("\nInvalid choice ");
                }
            } catch (InputMismatchException ex) {
                System.out.println("\nInvalid choice ");
                input.nextInt();
            }
        }
    }

    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    //    check deposit money
    public void getCheckingDepositInput() {
        boolean flag = false;
        while (!flag) {
            try {
                System.out.println("Current account balance: " + moneyFormat.format(checkingBalance));
                System.out.println("\nAccount you want to withdraw: ");
                double amount = input.nextDouble();
                if ((checkingBalance - amount) >= 0 && amount >= 0) {
                    //  calcCheckingDeposit
                    calcCheckingDeposit(amount);
                    System.out.println("Current balance: " + moneyFormat.format(checkingBalance));
                    flag = true;
                } else {
                    System.out.println("\nInvalid choice ");
                }
            } catch (InputMismatchException ex) {
                System.out.println("\nInvalid choice ");
                input.nextInt();
            }
        }
    }

    //    saving account
    public void getSavingWithdrawInput() {

    }

    public void getSavingDepositInput() {

    }

    public void getTransferInput() {
//        1. Check account exit?
//        2. Check balance
//        3. Transfer money
//        4. Display info
        boolean flag = false;
        while (!flag) {
        }
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public DecimalFormat getMoneyFormat() {
        return moneyFormat;
    }

    public void setMoneyFormat(DecimalFormat moneyFormat) {
        this.moneyFormat = moneyFormat;
    }
}
