package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab=2.0;
        double ac=2.0;
        double bc=2.0;
        boolean result =Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);

    }
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Test
    public void when2Exist() {
        double ab=2.0;
        double ac=2.0;
        double bc=8.0;
        boolean result =Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);

    }
}