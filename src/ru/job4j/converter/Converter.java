package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int in1 = 180;

        int expected = 2;
        int expected1 = 3;
        int out = Converter.rubleToEuro(in);
        int out1 = Converter.rubleToDollar(in1);
        boolean passed = expected == out;
        boolean passed1 = expected1 == out1;

        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("180 rubles are 3. Test result : " + passed1);
    }
}
