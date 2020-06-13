package task6;

// Print Fibonacci Sequence for numbers less than x

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter x value : ");
        int x = scanner.nextInt();
        
        forLoop(x);
        whileLoop(x);
        doWhileLoop(x);
        
    }
    
    private static void forLoop(int x){
        System.out.println("For Loop");

        int value1 = 0;
        int value2 = 1;

        for (int i = 0; i < x ; i = value1 + value2) {
            System.out.println(i);
            value1 = value2;
            value2 = i;
            
        }
    }

    private static void whileLoop(int x){
        System.out.println("While Loop");
        int value1 = 0;
        int value2 = 1;
        int i = 0;
        while (i < x){
            System.out.println(i);
            value1 = value2;
            value2 = i;
            i = value1 + value2;

        }

    }

    private static void doWhileLoop(int x){
        System.out.println("Do-While Loop");
        int value1 = 0;
        int value2 = 1;
        int i = 0;
        do {
            System.out.println(i);
            value1 = value2;
            value2 = i;
            i = value1 + value2;
        }while (i < x);

    }

    
    
}
