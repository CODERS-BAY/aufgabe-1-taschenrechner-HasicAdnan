import java.util.Random;
import java.util.Scanner;

public class Calculator {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        char operator = Methods.QuestionWichOperation();;
        Methods.floatingOrIntegerNumbers();
        int numberFloatingOrInteger = scan.nextInt();
        Methods.printResult(numberFloatingOrInteger,operator);
        scan.close();
    }
}
