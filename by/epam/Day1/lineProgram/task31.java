package by.epam.Day1.lineProgram;

import by.epam.Day1.scanner.EnterFromConsole;

public class task31 {

    public static void main(String args[]) {

        double u, u1, t1, t2;
        System.out.println("Enter u");
        u = EnterFromConsole.EnterDouble();
        System.out.println("Enter u1");
        u1 = EnterFromConsole.EnterDouble();
        System.out.println("Enter t1");
        t1 = EnterFromConsole.EnterDouble();
        System.out.println("Enter t2");
        t2 = EnterFromConsole.EnterDouble();

        double result = u * t1 + (u - u1) * t2;
        System.out.println("way on river " + result + " km");
    }
}
