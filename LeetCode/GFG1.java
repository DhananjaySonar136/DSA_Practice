// User function Template for Java

import java.util.Arrays;

class Solution {
    long countTriplets(int n, int sum, long arr[]) {
        
        Arrays.sort(arr);
        
        long count=0L;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            
            while(j<k){
                
                long actualsum=arr[i] + arr[j] + arr[k];
                if(actualsum<sum){
                    count=count +(k-j);
                    j++;       
                }
                else if(actualsum>=sum){
                    k--;
                }
            }
        }
        
        return count;
        
    }
}
