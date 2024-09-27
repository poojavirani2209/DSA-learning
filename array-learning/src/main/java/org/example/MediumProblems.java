package org.example;

import java.util.HashMap;
import java.util.Map;

public class MediumProblems {
    public int[] rearrange(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
                newArr[i] = -1;

        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0) {
                newArr[arr[i]] = arr[i];
            }
        }
        return newArr;
    }

    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> duplicateCheck= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(duplicateCheck.get(nums[i])==null){
                duplicateCheck.put(nums[i],0);
            }
            int count = duplicateCheck.get(nums[i]);
            duplicateCheck.put(nums[i],++count);
            if(count>1){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        MediumProblems mediumProblems = new MediumProblems();
        mediumProblems.containsDuplicate(new int[] {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1});

    }
}
