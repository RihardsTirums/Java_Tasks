package tesk4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter amount of numbers you would like to print out: ");
        int x = scanner.nextInt();
        System.out.print("Please enter starting number from witch to print out: ");
        int y = scanner.nextInt();

        forLoop(x, y);
        whileLoop(x, y);
        doWhileLoop(x, y);
    }
    private static void forLoop(int x, int y){
        System.out.println("For Loop");
        for (int i = 0; i <=x; i+=2) {
            System.out.println(i);
        }

    }

    private static void whileLoop(int x, int y){
        System.out.println("While Loop");
        int i =0;
        while (i <= x){
            i+=2;
            System.out.println(i);
        }

    }

    private static void doWhileLoop(int x, int y){
        System.out.println("Do-While Loop");
        int i = 0;
        do {
            System.out.println(i);
            i+=2;
        }while (i <= x);
    }

}
