public class SecondLargest {
    
    static void secondLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            if(largest<arr[i]){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>largest && arr[i]>secondlargest){
                
                secondlargest=arr[i];

            }
        }

        if(secondlargest==Integer.MIN_VALUE){
            System.out.println("Largest :"+largest);
            System.out.println("No second Largest");
        }
        else{
            System.out.println("Largest :"+largest);
            System.out.println("Second Largest :"+secondlargest);
        }
    }

    public static void main(String[] args) {
        int arr[]={-1,-1,-1};

        secondLargest(arr);
    }
}
