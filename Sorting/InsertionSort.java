package Sorting;

import java.util.Arrays;

//Time Complexity 
//worst case= O(n^2)
//best case = O(n) because if already sorted then while loop do not get executed
public class InsertionSort {
    
    static void insertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j=i;

            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;

                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[]={10,2,14,23,12};
        insertion(arr);
    }
}
