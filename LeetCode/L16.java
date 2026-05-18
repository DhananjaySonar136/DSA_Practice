import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int total_sum=0;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            
            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                int sum=nums[i] + nums[j] + nums[k];

                //Find thr difference between sum and target use (abs)
                int difference=Math.abs(sum-target);

                //If difference is low than previous difference then change diff value and put sum into total sum
                if(difference<diff){
                    diff=difference;
                    total_sum=sum;
                }
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return total_sum;
    }
}