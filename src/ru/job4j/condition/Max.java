package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
      boolean max = true;
        int result = max ? right : left;
        return result;
    }
    public static void main(String[] result) {
        int left = 1;
        int right = 2;
        System.out.println(result);
    }
}