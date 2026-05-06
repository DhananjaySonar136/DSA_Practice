package Sorting;

import java.util.Arrays;

public class SelectionSort {
    
    //arr = [13 46 24 52 20 9]
    static int[] selection(int arr[]){

        for(int i=0;i<=arr.length-2;i++){

            //we will track index of smallest number
            int small=i;

            for(int j=i;j<=arr.length-1;j++){
                // if(arr[i]>arr[j]){
                //     int temp=arr[i];
                //     arr[i]=arr[j];
                //     arr[j]=temp;
                // }


                if(arr[small]>arr[j]){
                    small=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        System.out.println(Arrays.toString(selection(arr)));
    }
}
