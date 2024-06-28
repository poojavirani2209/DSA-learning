package org.example;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class FindValue {

    int[] arrayToFindValueOf;
    FindValue(int[] array){
        this.arrayToFindValueOf = array;
    }

    public int findMinimum()
    {
        int min=MAX_VALUE;
        for(int i=0;i<this.arrayToFindValueOf.length;i++){
            if(min>this.arrayToFindValueOf[i]) {
                min = this.arrayToFindValueOf[i];
            }
        }
        return min;
    }

    public int findSecondMinimum()
    {
        int min=MAX_VALUE;
        int lastmin =0;
        for(int i=0;i<this.arrayToFindValueOf.length;i++){
            if(min>this.arrayToFindValueOf[i]) {
                lastmin = min;
                min = this.arrayToFindValueOf[i];
            }
        }
        return lastmin;
    }

    public int findMaximum()
    {
        int max=MIN_VALUE;
        for(int i=0;i<this.arrayToFindValueOf.length;i++){
            if(max<this.arrayToFindValueOf[i]) {
                max = this.arrayToFindValueOf[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        FindValue findValue = new FindValue(new int[]{1,0,4,5,6});
        System.out.println("The minimum value is: "+ findValue.findMinimum());
        System.out.println("The second min value is: "+ findValue.findSecondMinimum());
        System.out.println("The maximum value is: "+ findValue.findMaximum());

    }
}
