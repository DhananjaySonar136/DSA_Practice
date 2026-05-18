import java.util.Arrays;

class Solution {
    public void sortColors(int[] arr) {
        
//Dutch National Flag
//Dividing array in 3 parts low mid high
    int low=0;
    int mid=0;
    int high=arr.length-1;

    while(mid<=high){

        //if(mid == 0) then swap array low and mid index value swap
        if(arr[mid]==0){
            int temp=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;

            //after swaping value increament low and mid
            low++;
            mid++;
        }
        
        else if(arr[mid] == 1){
            mid++;
        }
        else if(arr[mid] == 2){
            int temp=arr[mid];
            arr[mid]=arr[high];
            arr[high]=temp;

            high--;
        }
    }

    System.out.println(Arrays.toString(arr));

//--------------------------------------------------------------
        // for(int i=0;i<nums.length-1;i++){

        //     int j=i+1;
        //     while(j<nums.length){

        //         if(nums[i] > nums[j]){
        //             int temp=nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;

        //             j++;
        //         }
        //         else{
        //             j++;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(nums));

//--------------------------------------------------------------------

//Optimal Solution
        // int zero=0;
        // int one=0;
        // int two=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         zero++;
        //     }
        //     else if(nums[i]==1){
        //         one++;
        //     }
        //     else{
        //         two++;
        //     }
        // }

        // for(int i=0;i<=nums.length-1;i++){
        //     if(i<zero){
        //         nums[i]=0;
        //     }
        //     else if(i<(zero+one)){
        //         nums[i]=1;
        //     }
        //     else if(i< (one+zero+two)){
        //         nums[i]=2;
        //     }
        // }

        // System.out.println(Arrays.toString(nums));
    }
}