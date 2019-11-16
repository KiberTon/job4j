package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        if (first > second) {
            return first > second ? first : second;
        }
        if (second > third) {
            return second > third ? second : third;
        }
        if (third > second) {
            return third > second ? third : second;
        }
        if (first == second && second == third) {
            return second == third ? second : third;
        }
        return result;
    }
}
