package org.example;

public class FindMissinNumber {

    private int find(int[] arr){
        int sum = ((arr.length+1) *(arr.length+2))/2;
        int sumOfArr = sumOfArray(arr);
        return  sum-sumOfArr;
    }

    private int sumOfArray(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    public static void main(String args[]){
        FindMissinNumber findMissinNumber = new FindMissinNumber();
        System.out.println("Missing number is "+findMissinNumber.find(new int[]{5,4,2,3}));

    }
}
