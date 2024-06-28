package org.example;

/**
 * Write a Java program to reverse the elements of an array. The program should:
 *
 * Define an array with some initial values.
 * Implement a method to reverse the elements of the array in place.
 * Print the reversed array.
 * Example Input
 * An array with elements {1, 2, 3, 4, 5}.
 *
 * Example Output
 * c
 * Copy code
 * Reversed array:
 * 5 4 3 2 1
 */
public class ReverseArray {
    public int[] reverse(int[] arrayToReverse){
        int[] reversedArray = new int[arrayToReverse.length];
        int reverseCount =0;
        for(int i=arrayToReverse.length-1;i>=0;i--){
            reversedArray[reverseCount]=arrayToReverse[i];
            reverseCount++;
        }
        return reversedArray;
    }
    public static void main(String[] args){
        ReverseArray reverseArray = new ReverseArray();
        PrintElements printElements = new PrintElements();
        printElements.print(reverseArray.reverse(new int []{1,2,3,4,5}));
    }
}
