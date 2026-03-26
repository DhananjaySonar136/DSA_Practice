package Arrays3;

import java.util.HashMap;
import java.util.Map;

/*
arr[]={1,1,2,2,3,4,4};

3 is appearing once and other are twice it is in sorted order

*/
public class FindNoThatAppearsOnceAndOtherNoTwice {
    
    // int findNoOnceAppear(int arr[]){

    //     int last=arr[arr.length-1];
    //     int sum=(last * (last+1))/2;
    //     int total=sum*2;

    //     int arrsum=0;
    //     for(int i=0;i<arr.length;i++){
    //         arrsum=arrsum+arr[i];
    //     }

    //     int onceno=total-arrsum;
    //     return onceno;

    // }


    int findNoOnceAppear(int arr[]){

        // Map<Integer,Integer> m=new HashMap<>();

        // for(int i=0;i<arr.length;i++){

        //     m.put(i, arr[i]);
        // }

        // if(m.get(1)==1){
        //     return 
        // }
        // return 1;



        //2^2=0
        //2^3!=0
        int xor=0;
         for(int i=0;i<arr.length;i++){

            xor^=arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        
        int arr[]={1,2,2,3,3,4,4};
        FindNoThatAppearsOnceAndOtherNoTwice f=new FindNoThatAppearsOnceAndOtherNoTwice();
        System.err.println(f.findNoOnceAppear(arr));
    }
}
