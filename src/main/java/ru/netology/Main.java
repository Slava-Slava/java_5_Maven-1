package ru.netology;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        //long bonus = service.calculate(1000, true);
        //System.out.println(bonus);
        long expected = 30;
        long actual = service.calculate(1000,true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate(1_000_000,true);
        System.out.println("2. " + expected + " == ? == " + actual);
    }
}