package task1;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {



        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter amount of numbers you would like to print out: ");
        int x = scanner.nextInt();
        System.out.print("Please enter starting number from witch to print out: ");
        int y = scanner.nextInt();

        //Using for loop print out entered values by user ascending from x to y
        for (int counter = 0; counter < x ; counter++) {
            System.out.println("Printing values ascending " + y++);

        }

    }
}
