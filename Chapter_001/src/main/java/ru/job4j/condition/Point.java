package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {

        double a = (x2 - x1) * 2;
        double b = (y2 - y1) * 2;
        double c = Math.sqrt(a + b);
        return c;
//        double z = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
//        double d = Math.sqrt(z);
//        return d;

    }


    public static void main(String[] args) {

        double result = distance(3, 2, 2, 4);

        System.out.println("result (3, 2) to (2, 4) " + result);
    }
}
