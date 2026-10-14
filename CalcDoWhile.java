package practice;

import java.util.*;

public class CalcDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double a, b, result;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = a + b;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = a - b;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = a * b;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    if (b != 0) {
                        result = a / b;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Division by zero");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}