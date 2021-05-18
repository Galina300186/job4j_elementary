package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {3, 4, 8, 2, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 4, 6, 8};
        Assert.assertArrayEquals(expected, result);
    }
    @Test
    public void whenSort3() {
        int[] data = new int[] {5, 4, 3, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }
}