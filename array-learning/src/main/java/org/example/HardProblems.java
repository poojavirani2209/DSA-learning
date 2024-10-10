package org.example;

public class HardProblems {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] merged = merge(nums1,nums2);
        int n= merged.length;

        if(n%2==0){
            return( merged[(n/2)-1]+merged[n/2])/2;
        }
        else{
            return merged[Math.abs(n/2)] ;
        }


    }

    public int[] merge(int[] left, int[] right){
        int i=0;
        int j=0;
        int[] merged=new int[left.length+right.length];
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                merged[k]= left[i];
                i++;
                k++;
            }

            else if(left[i]>right[j]){
                merged[k]= right[j];
                j++;
                k++;
            }
            System.out.print(merged[k]);
        }
        while(k<left.length){
            merged[k]= left[i];
            i++;
            k++;
        }

        while(k<right.length){
            merged[k]= right[j];
            j++;
            k++;
        }

        return merged;
    }

    public static void main(String[] args) {
        HardProblems hardProblems = new HardProblems();
        hardProblems.findMedianSortedArrays(new int[]{1,3}, new int[]{2});
    }
}
