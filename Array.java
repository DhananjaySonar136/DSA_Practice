import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Array {
    int largestNumber(int[] arr){
        int largest=arr[0];
        int n=arr.length;
        for(int i=1;i<=n/2;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[n-i]>largest){
                largest=arr[n-i];
            }
        }

        return largest;
    }

    void findSecondLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int slargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }

            else if(arr[i]>slargest && arr[i]!=largest){
                slargest=arr[i];
            }
        }
        System.out.println("Largest :"+largest);
        System.out.println("Second largest :"+slargest);
    }

    boolean checkArraySorted(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    void removeDuplicates(int arr[]){
    //*******Brute Force Approch Time complexity = O(nlogn) + O(n) ******* *
    // Space Complexity O(n)
        // Set<Integer> s=new HashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     s.add(arr[i]);
        // }
        // int index=0;
        // for(int n:s){
        //     arr[index]=n;
        //     index++;
        // }
        // // System.out.println(s);
        // System.err.println("size :"+index);

    // ****************** Optimal Approach ***********
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
    public static void main(String[] args) {
        Array a1=new Array();
        int[] arr={1,2,2,2,3,3,4,4,5,6,10};

         a1.removeDuplicates(arr);
        // System.out.println("Largest number :"+a1.checkArraySorted(arr));
    }
}
