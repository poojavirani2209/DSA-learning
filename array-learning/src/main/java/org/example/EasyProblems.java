package org.example;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasyProblems {

    public void largestElements(int[] array, int howMany){
        int[] descOrderArray = selectionSort(array);
        for(int i=0;i<howMany;i++){
            System.out.println(descOrderArray[i]);
        }
    }

    public int findKthLargest(int[] nums, int k) {//TC is alot.
        int[] descOrderArray = selectionSort(nums);
        return descOrderArray[k-1];
    }

    public int findKthLargest2(int[] nums, int k) {
      mergeSort(nums, 0, nums.length-1);
      return nums[k-1];
    }
    public int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int max = arr[i];
            int maxValueInex = i;
            for(int j=i;j<arr.length;j++){
                if(max<arr[j]){
                    max = arr[j];
                    maxValueInex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxValueInex];
            arr[maxValueInex]= temp;

        }
        return arr;
    }

    public void mergeSort(int[] arr, int low, int high){
        int mid = (low+high)/2;
        if(low>=high){
            return;
        }
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public void merge(int[] array, int low,int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = array[low + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements of left[] if any
        while (i < n1) {
            array[k++] = left[i++];
        }

        // Copy remaining elements of right[] if any
        while (j < n2) {
            array[k++] = right[j++];
        }
    }

    public void moveAllZeroesToEng(int[] arr){//1,2,0,0,3,0
        int indexBeingFilled = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
             arr[indexBeingFilled]= arr[i];
             indexBeingFilled++;
            }
        }
        for(int i=indexBeingFilled;i<arr.length;i++){
            arr[i]=0;
        }
    }

    public void findSubArrayWithSum(int[] arr, int sum){//1,2,0,0,3,
        int startIndex=0;
        int endIndex=0;
        int innerSum=0;
        for(int i=0;i<arr.length;i++){
            if(innerSum<sum){
                innerSum = innerSum+arr[i];
                endIndex = i;
            }
            else if (innerSum>sum){
                innerSum = innerSum-arr[startIndex];
                innerSum = innerSum+arr[i];
                endIndex = i;
                startIndex++;
            }
            else if (innerSum == sum){
                System.out.print(startIndex+" "+endIndex);
            }

        }
    }

    public int removeElement(int[] nums, int val) {
        int z=0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]!=val){
                nums[z]= nums[i];
                z++;
            }
        }
        return z;
    }

    public int removeDuplicates(int[] nums) {
        int prev = nums[0];
        int z=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==prev){

            }
            else{
                nums[z]= prev;
                prev= nums[i];
                z++;
            }
        }
        nums[z]= prev;
        return z;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int prev = nums1[0];
        int k=0;
        while(j<n){
            if(nums1[i]<nums2[j]){
//                nums1[k]=nums1[]
                i++;
            }
            else if(nums2[j]<nums1[i]){
                prev = nums1[i];
                nums1[k] = nums2[j];
                j++;
            }
        }

    }


    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email:emails){
            String[] names = email.split("@");
            String localName = names[0].replaceAll("\\.","").replaceAll("\\+(.*)","");
            String domainName = names[1];
            System.out.println("LocalName: "+localName+"  "+"DomainName: "+domainName);

            if(!set.contains(domainName+localName)){
                set.add(domainName+localName);
            }

        }
        return set.size();

    }

    public int firstUniqChar(String s) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> duplicateChars = new LinkedHashSet<>();
        char[] chars = s.toCharArray();
        for(char c:chars){
            if(uniqueChars.contains(c)){
                uniqueChars.remove(c);
                duplicateChars.add(c);
            }
            else{
                if(!duplicateChars.contains(c))
                uniqueChars.add(c);
            }
        }
        if(new ArrayList<>(uniqueChars).size()==0){return -1;}
        return s.indexOf(new ArrayList<>(uniqueChars).get(0));

    }

    public String[] getFolderNames(String[] names) {
        Set<String> folderNames = new LinkedHashSet<String>();
        for(String name:names){
            while(folderNames.contains(name)){
                int number = getEndingNumber(name);
                if(number!=0) {
                   name = name.replaceAll("\\(\\d+\\)$", "");
                }
                number++;
                name = name +"("+number+")";
            }
            folderNames.add(name);
        }
        return folderNames.toArray(new String[0]);
    }

    public static int getEndingNumber(String input) {
        Pattern pattern = Pattern.compile("\\(\\d+\\)$");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return Integer.parseInt(matcher.group().replaceAll("\\(","").replaceAll("\\)",""));
        } else {
            return 0;
        }
    }
    public static void main(String[] args){
        EasyProblems easyProblems = new EasyProblems();
    //  easyProblems.getFolderNames(new String[]{"pes","fifa","gta","pes(2019)"});
        //easyProblems.getFolderNames(new String[]{"gta","gta(1)","gta","avalon"});
        easyProblems.getFolderNames(new String[]{"onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"});

    }
}
