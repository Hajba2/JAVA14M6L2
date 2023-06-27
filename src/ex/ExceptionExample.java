package ex;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 99;
        arr[9] = 90909;

        //arr[99] = 9;

    }

    public static void first() {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = 2;

            int b = 1;
            b = scanner.nextInt();

            double c = 0;
            c = a / b;

            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("You can`t / by zero \n" + e);
        } catch (Exception e) {
            System.out.println("You must enter number Exception \n" + e);
        } finally {
            scanner.close();
        }
    }
}
