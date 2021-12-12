package newhomework;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please input a");
        int a = scanner.nextInt();
        System.out.println("please input b");
        int b = scanner.nextInt();

        System.out.println("please input operation (+,-,/,*)");
        String operation = scanner.next();
        Calculator calculator = new Calculator();

        switch (operation){
            case "+":
                System.out.println(calculator.plus(a, b));
                break;
            case "-":
                System.out.println(calculator.minus(a, b));
                break;
            case "/":
                System.out.println(calculator.divide(a, b));
                break;
            case "*":
                System.out.println(calculator.multiple(a, b));
                break;

            default:
                System.out.println("invalid operation");
        }
    }
}
