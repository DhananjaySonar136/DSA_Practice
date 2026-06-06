import java.util.Arrays;

public class selectionsort {

    static void sort(int arr[]){

        //50,10,30,20,40
        for(int i=0;i<=arr.length-2;i++){
            int small=i;

            for(int j=i;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

            //swap
            // int temp=arr[small];
            // arr[small]=arr[i];
            // arr[i]=temp;
        }

        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        sort(new int[]{50,10,30,20,40});
    }
}
