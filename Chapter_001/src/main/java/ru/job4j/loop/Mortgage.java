package ru.job4j.loop;

public class Mortgage {
     public int year(int amount, int salary, double percent) {
         int year = 0;

         while (amount >= 0) {
             double с = (amount - percent) + salary;
             double p = с - salary;

             year++;
         }
         return year;
     }

    public static void main(String[] args) {
        System.out.println(new Mortgage().year(100, 120, 50));
    }
}
