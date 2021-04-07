package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount user = new BankAccount(40);
        user.deposit(30);
        System.out.println("CURRENT AMOUNT "+user.getAmount());
        while (true) {
            try {
                user.withDraw(100);
            } catch (LimitException e) {
                try {
                    System.out.println("Желаемая сумма для снятия со счёта: " + user.getTakeMoney());
                    user.withDraw((int) user.getAmount());
                    System.out.println("Доступная сумма для снятия со счёта: "+ user.getTakeMoney());
                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }
                System.out.println(("Оставшаяся сумма: " + user.getAmount()));
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