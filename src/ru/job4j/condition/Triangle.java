package ru.job4j.condition;

public class Triangle {
    @SuppressWarnings("checkstyle:NoWhitespaceAfter")
    public static boolean exist (double ab, double ac, double bc) {
        return false == !(ab + ac > bc && ac + bc > ab && ab + bc > ac)?true:false;
    }
    public static void main(String[] args) {
        boolean result=Triangle.exist(2, 2, 1);
        System.out.println(result);
    }
}
