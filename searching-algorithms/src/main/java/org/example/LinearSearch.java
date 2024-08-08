package org.example;

public class LinearSearch {
    private String search(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return "found";
            }
        }
        return "not found";

    }

    public static void main(String[] args){
        System.out.println(new LinearSearch().search(new int[]{1,2,3},3));
    }
}
