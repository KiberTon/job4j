package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1EqualsTo2() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }
}
