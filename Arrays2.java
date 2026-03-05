import java.util.Arrays;

public class Arrays2 {

    //Left Rotating array by one place 
    //Eg. 1 2 3 4 5  Answer -> 2 3 4 5 1 
    void rotateleft(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }

    //Rotate left upto 'S' numbers in same array
    void leftRotate(int arr[],int s){
        int n=arr.length;
        s=s%n;
        int temp[]=new int[s];
        for(int i=0;i<s;i++){
            temp[i]=arr[i];
        }

        for(int i=s;i<n;i++){
            arr[i-s]=arr[i];
        }

        for(int i=n-s;i<n;i++){
            arr[i]=temp[i-(n-s)];
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }

    void reverse(int arr[],int start,int end){
        int j=end;
        for(int i=start;i<j;i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }

    }
    void leftRotate1(int arr[],int s){
        int n=arr.length;
        reverse(arr, 0, s-1);
        reverse(arr, s, n-1);
        reverse(arr, 0, n-1);

         for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        
        Arrays2 a2=new Arrays2();
        int arr[]={1,2,3,4,5,6,7};
        a2.leftRotate1(arr, 3);
        // a2.rotateleft(arr);
    }
}
