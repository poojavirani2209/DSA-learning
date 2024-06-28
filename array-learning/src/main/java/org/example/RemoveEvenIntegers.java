package org.example;

/**
 * Write a Java program to remove all even integers from an array. The program should:
 *
 * 1. Define an array with some initial integer values.
 * 2. Iterate through the array and filter out the even integers.
 * 3. Store the remaining odd integers in a new array.
 * 4. Print the resulting array with only odd integers.
 *
 * Example Input
 * An array with elements {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}.
 *
 * Example Output
 * Array after removing even integers:
 * 1 3 5 7 9
 */
public class RemoveEvenIntegers {

    public int[] getOddIntegers(int[] arrayWithOddAndEvenIntegers){
        int oddCount = 0;
        for(int i=0;i<arrayWithOddAndEvenIntegers.length;i++){
            if(arrayWithOddAndEvenIntegers[i]%2!=0)
            {
                oddCount++;
            }
        }
        int[] arrayWithOddIntegers = new int[oddCount];

        int oddCountIndex =0;
        for(int i=0;i<arrayWithOddAndEvenIntegers.length;i++){
            if(arrayWithOddAndEvenIntegers[i]%2!=0)
            {
                arrayWithOddIntegers[oddCountIndex]=arrayWithOddAndEvenIntegers[i];
                oddCountIndex++;
            }
        }
        return arrayWithOddIntegers;
    }

    public static  void main(String[] args){
        RemoveEvenIntegers removeEvenIntegers = new RemoveEvenIntegers();
         int[] oddIntegers = removeEvenIntegers.getOddIntegers(new int[]{1,2,3,5,6});
         new PrintElements().print(oddIntegers);
    }


}
