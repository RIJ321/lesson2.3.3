package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount user = new BankAccount(40);
        user.deposit(34);

        while (true) {
            try {
                System.out.println(user.withDraw(700));
                break;
            } catch (LimitException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
/*
a)  Написать класс проверяемого исключения LimitException, с конструктором LimitException
(String message, double remainingAmount) и методом getRemainingAmount().

b)  Написать класс BankAccount с 1 полем double amount - остаток на счете
                и методами
getAmount() - возвращает текущий остаток на счете,
deposit(double sum) - положить деньги на счет,
withDraw(int sum) - снимает указанную сумму со счета.

c)  Также метод withDraw() может сгенерировать исключение в том случае
 если запрашиваемая сумма на снятие больше чем остаток денег на счете.

d)  Написать Main класс где бы создавался счет клиента. Положить 20 000 сом на счет.

e)  Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом,
 при этом отлавливать исключение LimitException и при возникновении такого исключения снимать только ту сумму,
  которая осталась на счете и завершать бесконечный цикл

 */