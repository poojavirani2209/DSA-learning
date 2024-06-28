package org.example;

/**
 * Write a Java program to print all the elements of an array. The program should:
 *
 * Define an array with some initial values.
 * 1. Iterate through the array using a loop.
 * 2. Print each element of the array with its index.
 *
 * Example Input
 *  An array with elements {1, 2, 3, 4, 5}.
 *
 * Example Output
 * Element at index 0: 1
 * Element at index 1: 2
 * Element at index 2: 3
 * Element at index 3: 4
 * Element at index 4: 5
 */
public class PrintElements {
    /**
     * Array starts with index 0.
     * takes input of array of any object type. Here Object is the parent class of all inbuilt classes in java.
     * Time complexity is O(n) as there is a for loop going through each element of array
     * Space complexity is O(1)
     */
    public void print(Object[] arrayToPrint){
        for(int i=0;i<arrayToPrint.length;i++){
            System.out.println("Element at index "+i+": "+arrayToPrint[i]);
        }
        System.out.println("");
    }

    /**
     * Method overloading by changing the data type of input parameter
     */
    public void print(int[] arrayToPrint) {
        for(int i=0;i<arrayToPrint.length;i++){
            System.out.println("Element at index "+i+": "+arrayToPrint[i]);
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        PrintElements printElements = new PrintElements();
        printElements.print(new int[]{1,2,3,4,5});
        printElements.print(new String[]{"a","b","x"});
    }
}
