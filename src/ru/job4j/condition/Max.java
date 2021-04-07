package ru.job4j.condition;

public class Max {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static int max(int left, int right) {
        int result = left > right?left:right;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int result= Max.max(45, 67);
        System.out.println(result);
    }
}