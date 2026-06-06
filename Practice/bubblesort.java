import java.util.Arrays;

public class bubblesort {

    static void sort(int arr[]){

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-i-1;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={10,50,40,20,30};
        sort(arr);
    }
}