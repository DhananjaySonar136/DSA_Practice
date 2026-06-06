package Practice;

import java.util.Arrays;

public class mergesort {
    
    static void merge(int arr[],int low,int mid,int high){

        int left=low;
        int right=mid+1;
        int count=0;
        int temp[]=new int[arr.length];
        while(left <= mid && right <= high){

            if(arr[left] <= arr[right]){

                temp[count]=arr[left];
                left++;
                count++;
            }
            else{
                temp[count]=arr[right];
                right++;
                count++;
            }
        }
        while(left<=mid){
            temp[count]=arr[left];
            left++;
            count++;
        }

        while(right<=high){
            temp[count]=arr[right];
            right++;
            count++;
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }

        //ORRRRRRRRRRRRRRRRRRRR

        // for(int i = 0; i < temp.length; i++) {
        //     arr[low + i] = temp[i];
        // }
    }

    static void msort(int arr[],int low ,int high){

        if(low >= high)
            return;
        int mid=(low+high)/2;
        msort(arr, low, mid);
        msort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        // sort(new int[]{30,10,50,20,40},0,5);
         int arr[]={10,50,23,15,26,-9,2};
        msort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
