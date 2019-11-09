package app.classes.PracticeQuestions;

import java.util.Scanner;

public class MyClassPracticeQuestions {

    public void printStuff() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        double abc = scanner.nextDouble();
        System.out.print("Second number: ");
        double def = scanner.nextDouble();
        System.out.println(abc);
        System.out.println(def);
        double ghi = abc * def;
        System.out.println(abc + " plus " + def + " makes " + ghi);

    }

    public void printValue() {
        double x = 50, y = 20;
        double z = x + y;
        System.out.println(" z is " + z);

        x = y;
        y = x;
        System.out.println(" x is " + x);
        System.out.println(" y is " + y);

        z = z + y;
        System.out.println(" z is " + z);

        z = x - z;
        System.out.println(" z is " + z);

    }

    public void print
}