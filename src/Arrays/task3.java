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

    // addElementAtIndex method will add element at the specific index in array.
    private static int[] addElementAtIndex(int original[],int element,int index){
        int result [] = new int [original.length+1];
        for (int i = 0; i < result.length ; i++) {
            if (i < index) {
                result[i] = original[i];
            } else if (i == index) {
                result[i] = element;
            } else {
                result[i] = original[i - 1];
            }
        }
        return result;
    }

    // addElement method will add element at the end of array.
    private static int[] addElement(int numbers[],int addingValue){
        int elements [] = new int [numbers.length+1];

        for (int i = 0; i < numbers.length ; i++) {
            elements[i] = numbers[i];
        }
        elements[elements.length-1] = addingValue;
        System.out.print("New Array: " + Arrays.toString(elements));
        return elements;
    }



    public static void main(String[] args) {

        int [] numbers = {1,2,3};
        System.out.println("Old Array: " + Arrays.toString(numbers));

        // Add value to array and save it.
        int[] saveValue = addElement(numbers,4);

        // Add value to array by index
        int[] byIndex = addElementAtIndex(numbers,15,2);
        System.out.println(Arrays.toString(byIndex));



    }


    }

