package ru.job4j.calculate;

public class Fit {

    public static double manWeight(double height) {
        return height - 100 * 1.15;
    }

    public static double womanWeight(double height) {
        return height - 110 * 1.15;
    }

    public static void main(String[] args) {

        double man = manWeight(188);
        System.out.println("Man 188 is " + man);

        double woman = womanWeight(173);
        System.out.println("Woman 173 is " + woman);
    }
}
