package org.example;

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

    public static void main(String[] args){
        EasyProblems easyProblems = new EasyProblems();
        easyProblems.findSubArrayWithSum(new int[]{23,2,4,6,7},6);


    }
}
