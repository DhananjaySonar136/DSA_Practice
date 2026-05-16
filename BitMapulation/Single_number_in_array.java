package BitMapulation;

public class Single_number_in_array {
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
         

        //Time complexity = O(n)
        //Space complexity = O(1)
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
