package Sorting;

import java.util.Arrays;

public class QuickSort {

    //method to find pivot position
    static int findPivot(int arr[],int low,int high){
        int i=low;
        int j=high;
        int pivot=low;  //here pivot assume is the first element in a array(partition)

        //run while loop upto i<j
        while(i<j){

            //while arr[i] is less then pivot then i++   and i should go upto high
            while(arr[i]<=arr[pivot] && i<high){
                i++;
            }

            //while arr[i] is greater than pivot then j--   and j should go upto low
            while(arr[j]>arr[pivot] && j>low){
                j--;
            }


            //if i and j stucks then swap them i and j   and again while loop runs 
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        //if above while loop condition fails means i exceded j then swap pivot with arr[j]
        //And here the pivot is placed at its proper position
        int temp=arr[j];
        arr[j]=arr[pivot];
        arr[pivot]=temp;
    
        //and now the pivot will be at j position and then return position of pivot means j
        return j;
    }



    //method to sort array by quickSort
    static void quickSort(int arr[],int low,int high){

        //sort if the array is minimum 2 size means low < high
        if(low<high){

            //method return the position of pivot(pivot index) and arrange the pivot in its proper position
            int pivotIdx=findPivot(arr,low,high);

            //Now there will be 2 partion one is left of pivot and other right of pivot
            //Now call quickSort on left partition ( low to pivotIdx )
            quickSort(arr, low, pivotIdx-1);

            //Now ca;; quickSort on right partition of pivot which is from ( pivotIdx to high )
            quickSort(arr, pivotIdx+1, high);
        }

        
    }

    public static void main(String[] args) {
        int arr[]={8,5,4,3,2,1,6,9,7};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }   
}
