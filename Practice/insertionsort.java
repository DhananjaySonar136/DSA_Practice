import java.util.Arrays;

public class insertionsort {
    
    static void sort(int arr[]){
        for(int i=0;i<=arr.length-1;i++){

            int j=i;

            while(j>0 && arr[j-1]>arr[j]){
                //swap
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;

                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {

        sort(new int[]{50,20,10,40,30});
    }
}
