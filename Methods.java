import java.util.Random;
import java.util.Scanner;

public class Methods {

    static Scanner scan = new Scanner(System.in);

    public static char QuestionWichOperation() {
        char operator;
        System.out.println("Which operation you want +, %, *, -, /");
        return operator = scan.nextLine().toLowerCase().charAt(0);
    }

    public static void floatingOrIntegerNumbers() {
        System.out.println("Choose between floating-point and integer operations\n" + "1) integer\n" + "2) floating\n" + "3) random");
    }

    public static int twoIntegerNumbers(int x, int y, char character) {

        switch (character) {
            case '+':
                return (x + y);
            case '-':
                return (x - y);
            case 'x':
                return (x * y);
            case '*':
                return (x * y);
            case '/':
                return (x / y);
            case '%':
                return (x % y);
        }
        return 1;
    }

    public static double twoDoubleNumbers(double x, double y, char character) {

        switch (character) {
            case '+':
                return (x + y);
            case '-':
                return (x - y);
            case 'x':
                return (x * y);
            case '*':
                return (x * y);
            case '/':
                return (x / y);
            case '%':
                return (x % y);
        }
        return 1.0;
    }

    public static void printIntegerResult(int x, int y, int res, char op) {
        switch (op) {
            case '+':
                System.out.println(x + " + " + y + " = " + res);
                break;
            case '-':
                System.out.println(x + " - " + y + " = " + res);
                break;
            case 'x':
                System.out.println(x + " x " + y + " = " + res);
                break;
            case '*':
                System.out.println(x + " x " + y + " = " + res);
                break;
            case '/':
                String ausdruck = String.format("%.2f", res);
                System.out.println(x + " / " + y + " = " + ausdruck);
                break;
            case '%':
                System.out.println(x + " % " + y + " = " + res);
                break;
        }
    }

    public static void printDoubleResult(double x, double y, double res, char op) {
        switch (op) {
            case '+':
                System.out.println(x + " + " + y + " = " + res);
                break;
            case '-':
                System.out.println(x + " - " + y + " = " + res);
                break;
            case 'x':
                System.out.println(x + " x " + y + " = " + res);
                break;
            case '*':
                System.out.println(x + " x " + y + " = " + res);
                break;
            case '/':
                String ausdruck = String.format("%.2f", res);
                System.out.println(x + " / " + y + " = " + ausdruck);
                break;
            case '%':
                System.out.println(x + " % " + y + " = " + res);
                break;
        }
    }

    public static int randomNumber() {
        int number = Math.abs(new Random().nextInt());
        return number;
    }

    public static void printResult(int choice, char characterChoice) {
        if (choice == 1) {
            System.out.println("Enter the first number : ");
            int x = scan.nextInt();
            System.out.println("Enter the second number: ");
            int y = scan.nextInt();
            twoIntegerNumbers(x, y, characterChoice);
            printIntegerResult(x, y, twoIntegerNumbers(x, y, characterChoice), characterChoice);
        } else if (choice == 2) {
            System.out.println("Enter the first number : ");
            double w = scan.nextDouble();
            System.out.println("Enter the second number: ");
            double z = scan.nextDouble();
            twoDoubleNumbers(w, z, characterChoice);
            printDoubleResult(w, z, twoDoubleNumbers(w, z, characterChoice), characterChoice);
        } else {
            System.out.println("Random number is : " + randomNumber());
        }
    }
}
