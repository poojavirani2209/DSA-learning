package org.example;

public class BinarySearch {
    private int search(int[] nums,int target) {
        int high = nums.length-1;
        int low = 0;
        int mid =0;
        while (low <= high) {
             mid = Math.abs((high + low) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid-1;
            } else if (nums[mid] < target) {
                low = mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(new BinarySearch().search(new int[]{1,3,4,5},2));
    }
}
