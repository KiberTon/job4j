package ru.job4j.calculate;

/**
 * Calculate.
 *
 * @author Anton Kibekin (kibekin1984anton@gmail.com)
 */

public class Calculate {

    /**
     * add
     *
     * @param first
     * @param second
     */

    public static void add(int first, int second) {
        int result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * div
     *
     * @param first
     * @param second
     */

    public static void div(int first, int second) {
        int result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * multiply
     *
     * @param first
     * @param second
     */
    public static void multiply(int first, int second) {
        int result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * subtract
     *
     * @param first
     * @param second
     */

    public static void subtract(int first, int second) {
        int result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * main
     *
     * @param args
     */


    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        subtract(10, 5);
        multiply(2, 1);

    }
}
