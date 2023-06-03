package ru.netology.javaqa.javaqamvn.services;

public class CalcService {

    public int calculate(int income, int expense, int threshold) {
        int counter = 0; // счётчик месяцев отдыха
        int money = 0; //количество денег на счету
        int i;
        for (i = 0; i < 12; i++)
            if (money >= threshold) { // можем ли отдыхать?
                money = money - expense;
                money = money / 3;
                counter++;
            } else {
                money = money + income - expense;
            }
        return counter;
    }
}
