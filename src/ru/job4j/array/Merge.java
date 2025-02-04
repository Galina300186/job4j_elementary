package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < rsl.length; k++) {
            if ((i > left.length - 1) || left[i] > right[j]) {
                rsl[k] = right[j];
                j++;
            } else if ((j > right.length - 1) || (left[i] < right[j])) {
                rsl[k] = left[i];
                i++;
            } else {
                rsl[k] = left[j];
                j++;
            }
        }
        return rsl;
    }
}