package mybank;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author peter
 */

public class Account {

    private static ArrayList<Account> accounts = new ArrayList<Account>();
    private static int totalAccounts = 0;
    private static double totalBalance = 0.0;
    private static ArrayList<String> accountNames = new ArrayList<String>();

    private String name = "";
    private double balance = 0.00;
    private int accountNo = 0;

    public Account(String na, int ac, double ba) {
        name = na;
        accountNo = ac;
        balance = ba;
        addAccount(this);
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void modify(double change) {
        balance += change;
        totalBalance += change;
    }

    private static void addAccount(Account acc) {
        accounts.add(acc);
        totalAccounts++;
        totalBalance += acc.getBalance();
        accountNames.add(acc.getName());
    }

    public static Account findAccount(int accountNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNo() == accountNo) {
                return acc;
            }
        }
        return null;
    }

    public static void displayAccounts() {
        System.out.println("Accounts: ");
        for (Account acc : accounts) {
            System.out.println("Name: " + acc.getName() + ", Account Number: " + acc.getAccountNo() + ", Balance: " + acc.getBalance());
        }
    }

    public static void displayTotal() {
        System.out.println("Total Accounts: " + totalAccounts + ", Total Balance: " + totalBalance);
    }

    public static void displayAccountNames() {
        System.out.println("Account Names: " + accountNames);
    }

}
