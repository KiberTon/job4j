package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double с) {
        double p = (a + b + с) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - с));
        return s;
    }
    public static void main(String[] args) {

        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
