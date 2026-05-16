// Problem :- Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

public class L136 {
    public int singleNumber(int[] nums) {
        int xor=0;
        //0^0=0
        //1^1=0  a^a=0  
        //0^1=1  a^0=a
        //1^0=1 

        //1,2,4,1,2
        //0^1=1 => 1^2=3  => 3^4=7  => 7^1=6  => 6^2=4
        //so final single number is 4
        //same number cancel
         
        for(int i : nums){
            xor=xor^i;
        }

        return xor;

        // HashMap<Integer,Integer> map=new HashMap<>();

        // for(int i=0;i<nums.length;i++){
        //     int count=map.getOrDefault(nums[i],0);
        //     map.put(nums[i],count+1);
        // }

        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     if(entry.getValue() == 1){
        //         return entry.getKey();
        //     }
        // }
        //return 0;
    }
}
}
