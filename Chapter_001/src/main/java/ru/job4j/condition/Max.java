package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        if (left >= right) {
            boolean condition = true;
            int result = condition ? left : right;
            return result;
        }

        int result = right;
        return result;
    }
}
