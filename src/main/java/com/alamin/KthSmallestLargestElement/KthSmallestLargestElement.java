package com.alamin.KthSmallestLargestElement;

public class KthSmallestLargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,10,11,1,3,19,8,7};
        KthSmallestLargestElement q = new KthSmallestLargestElement();
        System.out.println("5th smallest element is ->" + q.getKthSmallestElement(arr,5, 0, arr.length-1));
        System.out.println("2th highest element is ->" + q.getKthHighestElement(arr,5, 0, arr.length-1));
    }

    private int getKthSmallestElement(int[] arr, int k, int low, int high) {
        int pivotPoint = getPivotPoint(arr,low,high);
        if(pivotPoint == k-1) return arr[pivotPoint];
        else if(pivotPoint < k-1) return getKthSmallestElement(arr,k,pivotPoint + 1,high);
            //4,5,10,11,1,3,19,8,7
            // 4 5 1 3 7 10 11 19 8
        else return getKthSmallestElement(arr,k,low,pivotPoint -1);
    }


    private int getPivotPoint(int[] arr, int low, int high) {
        int pivotElement = arr[high];
        int pivotPoint = low;

        for(int i= low;i<=high;i++){
            if(arr[i] < pivotElement){
                int tmp = arr[i];
                arr[i] = arr[pivotPoint];
                arr[pivotPoint] = tmp;
                pivotPoint++;
            }
            //4,5,10,11,1,3,19,8,7
            //4 5 1 11 10 3 19 8 7
            // 4 5 1 3 10 11 19 8 7
            //pivotPoint =5
            //i=5

        }
        int tmp = arr[pivotPoint];
        arr[pivotPoint] = arr[high];
        arr[high] = tmp;

        return pivotPoint;
    }

    private int getKthHighestElement(int[] arr, int k, int low, int high) {
        int pivotPoint = getPivotPoint(arr, low, high);
        int kthHighestIndex = arr.length - k; // Calculate the index of the kth highest element

        if (pivotPoint == kthHighestIndex)
            return arr[pivotPoint];
        else if (pivotPoint < kthHighestIndex)
            return getKthHighestElement(arr, k, pivotPoint + 1, high);
        else
            return getKthHighestElement(arr, k, low, pivotPoint - 1);
    }

    private int getPivotPoint1(int[] arr, int low, int high) {
        int pivotElement = arr[high];
        int pivotIndex = low;

        for (int i = low; i < high; i++) {
            if (arr[i] <= pivotElement) {
                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;
                pivotIndex++;
            }
        }

        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = temp;

        return pivotIndex;
    }

}
