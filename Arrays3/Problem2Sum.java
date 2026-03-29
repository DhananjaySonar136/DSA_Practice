import java.util.Arrays;
import java.util.HashMap;

public class Problem2Sum {

//Brute force Approach TC=O(n^2)
    // int[] solve(int arr[],int target){

    //     for(int i=0;i<arr.length;i++){

    //         for(int j=i+1;j<arr.length;j++){

    //             if(arr[i]+arr[j]==target){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }

    //     return new int[]{-1,-1};
    // }


//Better Approach TC=O(N logN)  SC=O(N)
    int[] solve(int arr[],int target){

        //Make hash Map and Substract target-arr[i] and check the difference as key in hashmap present 
        //or not if present then return else no 
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int diff=target-arr[i];

            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            else{
                map.put(arr[i], i);
            }
        }
        return new int[]{-1,-1};

    }

    public static void main(String[] args) {
        
        Problem2Sum ps=new Problem2Sum();
        int arr[]={2,6,5,8,11};
        System.err.println(Arrays.toString(ps.solve(arr, 19)));

    }
}
