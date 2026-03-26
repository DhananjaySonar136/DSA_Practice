class LargestSubArrayWithSumK{

    void finSubArray(int arr[],int total){
       int length=1;
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){

                int sum=0;
                for(int k=i;k<=j;k++){    
                    sum=sum+arr[k];
                }
                if(sum==total){
                    length=Math.max(length, (j-i+1));
                }
            }
        }
        System.err.println(length);
    }

    public static void main(String[] args) {
       
        LargestSubArrayWithSumK l=new LargestSubArrayWithSumK();
        int arr[]={1,2,3,1,1,2,4,3};
        l.finSubArray(arr, 17);


    }
}