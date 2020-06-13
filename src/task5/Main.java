package task5;

import java.util.Scanner;

// Print x numbers that are divided by y without a remainder starting from z ( z also can be divided without a remainder )
public class Main {
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter x value (amount of numbers): ");
        int x = scanner.nextInt();
        System.out.print("Please enter y value (divider): ");
        int y = scanner.nextInt();
        System.out.print("Please enter z value (z will always be divided by y without remainder): ");
        int z = scanner.nextInt();

        forLoop(x, y, z);
        whileLoop(x, y, z);
        doWhileLoop(x, y,z);
    }

    private static void forLoop (int x, int y, int z){
        System.out.println("For Loop");
        for (int i = 0; i < x ; i++) {
            System.out.println(z);
            z = z + y ;

        }
    }

    private static void whileLoop (int x, int y, int z){
        System.out.println("While Loop");
        int i = 0;
        while (i < x){
            i++;
            System.out.println(z);
            z = z + y;
        }
    }

    private static void doWhileLoop(int x, int y, int z){
        System.out.println("Do-While Loop");
        int i = 0;
        do {
            i++;
            System.out.println(z);
            z = z + y;
        }while (i < x);
    }
}
