public class L88_Merge_Sorted_Array {
     public void merge(int[] nums1, int m, int[] nums2, int n) {

            int i=m-1;
            int j=n-1;
            int k=m+n-1;

            //while both the array elements are present upto hat compare both array elements
            while(i>=0 && j>=0){
                
                if(nums2[j]>nums1[i]){
                    nums1[k]=nums2[j];
                    j--;
                    k--;
                }
                else{
                    nums1[k]=nums1[i];
                    i--;
                    k--;
                }
            }
        
        //iif second array element remains then put as it is in first array
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}
