package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correct1 = ResultChecker.assertEquals(-3, subtractResult);
        if (correct1) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb" + a + " i " + b);
        }

        int c = 4;
        int squareResult = calculator.square(c);
        boolean correct3 = ResultChecker.assertEquals(16, squareResult);
        if (correct3) {
            System.out.println("Metoda square działa poprawnie dla liczby " + c);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + c);
        }
    }
}
