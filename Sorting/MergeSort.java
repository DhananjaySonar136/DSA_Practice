package Sorting;
import java.util.Arrays;

public class MergeSort {

    static void merge(int arr[],int low,int mid,int high){

        int left=low;
        int right=mid+1;
        int temp[]=new int[arr.length];
        int count=0;
            while(left<=mid && right<=high){

                if(arr[left]<=arr[right]){
                    temp[count]=arr[left];
                    left++;
                }
                else{
                    temp[count]=arr[right];
                    right++;
                }
                count++;
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
    }
    static void mergeSort(int arr[],int low,int high){

        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void main(String[] args) {
        int arr[]={10,50,23,15,26,-9,2};
        mergeSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}

