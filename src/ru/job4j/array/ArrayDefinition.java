package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        float[] prices = new float[40];
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        String[] names = new String[4];
        names[0] = "Ivan Petrov";
        names[1] = "james Bond";
        names[2] = "Sergei Ponomarev";
        names[3] = "Ostap Bender";
        String people = names[0];
        System.out.println(people);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println("Размер массива равен " + ages.length);
        System.out.println("Размер массива равен " + surnames.length);
        System.out.println("Размер массива равен " + prices.length);


    }
}
