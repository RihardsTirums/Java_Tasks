package Arrays;

/*
Group 2 - Arrays
Write a program to find the index of an array element.
Write a method that will create a copy of array.
Write following methods:
Add an element to array at the end.
Add an element to array at specific index.
Remove array element from specific index. NOTE: Arrays themselves cannot be changed. So you will need to create a new array each time.
Write a program to find the maximum and minimum value of a String array. Use s1.compareTo(s2) to find which string is greater (s1 and s1 has type String)
Write a method that will keep only unique Strings from String array.
Write a method to find the common elements between two String arrays.
Write a method to find the second smallest element in an array of integers.
Write a method that sums two matrices (2d arrays). If matrixes have different sizes - print an error message. Matrixes are summed by summing elements at same positions.
Write a method that checks if two arrays of String are the same. (have same strings on same indexes)
Write a method that move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
Write a method that returns the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.
Write a method that checks if given integer array consists only from elements provided in another integer array.
Write a method that finds two neighbouring numbers in an array with the smallest difference. The function should return the index of the first number.
 */


import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {

        int [] numbers = {1,2,3};
        System.out.println("Old Array: " + Arrays.toString(numbers));
        int elements [] = new int [numbers.length+1];

        for (int i = 0; i < numbers.length ; i++) {
            //System.out.println(numbers[i]);
            elements[i] = numbers[i];
        }
        elements[elements.length-1] = 67;
        System.out.print("New Array: " + Arrays.toString(elements));



    }
}
