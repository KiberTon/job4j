package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRubles(int value) {
        return value * 70;
    }

    public static int dollarToRubles(int value) {
        return value * 60;
    }

    public static void main(String[] args) {

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println(" 140 rubles are 2. Test result : " + passed);

        int in1 = 120;
        int expected1 = 2;
        int out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println(" 120 rubles are 2. Test result : " + passed1);

        int in2 = 2000;
        int expected2 = 140000;
        int out2 = euroToRubles(in2);
        boolean passed2 = expected2 == out2;
        System.out.println(" 2000 euro are 140000. Test result : " + passed2);

        int in3 = 300;
        int expected3 = 18000;
        int out3 = dollarToRubles(in3);
        boolean passed3 = expected3 == out3;
        System.out.println(" 300 dollars are. 18000. Test result : " + passed3);

        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int dollar = rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollars.");

        int rubles = euroToRubles(2000);
        System.out.println("2000 euro are " + rubles + " rubles.");

        int ruble = dollarToRubles(300);
        System.out.println("300 dollars are " + ruble + " rubles.");


    }
}
