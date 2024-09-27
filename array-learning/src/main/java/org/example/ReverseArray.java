package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    public int[] reverseWithNewArray(int[] arrayToReverse){
        /**
         * TC: O(n)
         * SC: O(n)
         */
        int[] reversedArray = new int[arrayToReverse.length];
        int reverseCount =0;
        for(int i=arrayToReverse.length-1;i>=0;i--){
            reversedArray[reverseCount]=arrayToReverse[i];
            reverseCount++;
        }
        return reversedArray;
    }

    public int[] reverseWithPointers(int[] arrayToReverse){
        /**
         * TC: O(n)
         * SC: O(1)
         */
        //pointers
        int i=0;
        int j=arrayToReverse.length-1;

        while(i!=j){
            int temp = arrayToReverse[i];
            arrayToReverse[i]= arrayToReverse[j];
            arrayToReverse[j] = temp;
            i++;
            j--;
        }
        return arrayToReverse;
    }

    public int[] reverseWithRecursion(int[] arrayToReverse, int start, int end){
        /**
         * TC: O(n)
         * SC: O(n) because of recursion stack
         */
        int temp = arrayToReverse[start];
        arrayToReverse[start]= arrayToReverse[end];
        arrayToReverse[end] = temp;
        if(start>end){
           return arrayToReverse;
        }
        return reverseWithRecursion(arrayToReverse, ++start,--end);
    }

//    public int[] reverseWithCollection(int[] arrayToReverse){
//        List<Integer> newArray = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5}));
//        Collections.reverse(newArray);
//        return newArray.toArray();
//    }

    public static void main(String[] args){
        ReverseArray reverseArray = new ReverseArray();
        PrintElements printElements = new PrintElements();
        reverseArray.reverseWithRecursion(new int[] {1,2,3,4,5},0, 4);
       printElements.print(reverseArray.reverseWithPointers(new int []{1,2,3,4,5}));
    }
}
