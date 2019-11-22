package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        int j = 0;
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                j++;
                sum += i;
            }
        }
        return sum;
    }

//
}
