package task3;

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

    }

    private static void forLoop(int x, int y){
        System.out.println("For Loop");
        for (int i = 1; i <=x; i+=2) {
            System.out.println(i);
        }

    }

    private static void whileLoop(int x, int y){
        System.out.println("While Loop");
    }


}
