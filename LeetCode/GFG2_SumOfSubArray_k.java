class Solution {
public int maxSubarraySum(int[] arr, int k) {
    // Code here
    
    int n=0;
    int max_sum=0;
    int low=0;
    int high=low+k-1;
    
    int sum=0;
    
    for(int i=0;i<=high;i++){
        sum=sum+arr[i];
    }
    
    while(high<arr.length){
        
        max_sum=Math.max(max_sum,sum);
        low++;
        high++;
            
        sum=sum -arr[low-1];
        if(high>=arr.length){
            break;
        }
        
        sum=sum + arr[high];
    }
    
    return max_sum;
    }
}