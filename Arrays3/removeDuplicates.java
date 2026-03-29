package Arrays3;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates {
    
    void removeDup(int arr[]){

       int i=0;
       int j=1;
       int count=1;
       while(j<arr.length-1){
             
             if(arr[i]==arr[j]){
                j++;
             }
             else{
                arr[i+1]=arr[j];
                i++;
                j++;
                count++;
             }
        }
        System.out.println(count); //OR System.out.println(i+1); 
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        
        removeDuplicates rd=new removeDuplicates();
        int arr[]={1,1,1,2,2,3,3};
        rd.removeDup(arr);
    }
}
