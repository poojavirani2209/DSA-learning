package org.example;

public class FindMissinNumber {

    private int find(int arr){
        int len = arr.length;
        int sum = (len(len+1))/2;
        int sumOfArr = sumOfArray(arr);
        return sumOfArr - sum;
    }

    private int sumOfArray(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    public static void main(String args[]){
        System.out.println("Missing number is":new int[]{5,4,2,3});

    }
}
