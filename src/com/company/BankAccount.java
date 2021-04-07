package com.company;


public class BankAccount {

    private double amount;
    double downloadMoney;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    double deposit(double downloadMoney) {
        this.downloadMoney = downloadMoney;
        System.out.println("Вы ввели: " + downloadMoney);
        return this.amount = amount + downloadMoney;
    }

    public double getAmount() {
        return amount;
    }

    int withDraw(int takeMoney) throws LimitException {
        if (takeMoney > amount) {
            throw new LimitException("REMAINING SUM IS MORE THAN CURRENT " + (amount - amount), amount);
        }
        return (int) getAmount() - takeMoney;
    }
}
