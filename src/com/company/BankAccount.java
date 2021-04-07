package com.company;


public class BankAccount {

    private double amount;
    private int takeMoney;

    public BankAccount(double amount) {
        System.out.println("Текущий счёт: " + amount);
        this.amount = amount;
    }

    double deposit(double downloadMoney) {
        System.out.println("Вы ввели: " + downloadMoney);
        return this.amount = amount + downloadMoney;
    }

    public double getAmount() {
        return amount;
    }

    int withDraw(int takeMoney) throws LimitException {
        this.takeMoney =takeMoney;
        if (takeMoney > amount) {
            throw new LimitException("DECIDED AMOUNT IS MORE THAN THE CURRENT " + amount, amount);
        }
        return (int) (this.amount = amount-takeMoney);
    }

    public int getTakeMoney() {
        return takeMoney;
    }
}
