class Solution {
    public int maxArea(int[] height) {
        
        int left=0;
        int right=height.length-1;
        int maxwater=0;

        while(left<=right){

            //calculate the width between both the lines
            int width=right-left;

            //now find minimum from both line and multiply with width so that how much capacity water will store we can find
            int watercap= width * Math.min(height[left],height[right]);
            
            //now find max water
            maxWater=Math.max(maxWater,watercap);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxWater;
    }
}