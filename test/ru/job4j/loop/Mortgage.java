package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double k = percent/100;
        int d = amount;
        while (amount >= 0) {
            year +=  1;
            amount *= k;
            amount += d;
            amount -= salary;
        }
        return year;
    }
}
