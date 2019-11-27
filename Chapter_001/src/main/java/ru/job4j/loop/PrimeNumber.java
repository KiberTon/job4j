package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int i = 1; i * i <= finish; i++) {


            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0) {
                    count++;
                }
            }
        }
        return count;
    }


}
