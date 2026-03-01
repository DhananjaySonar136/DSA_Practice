import java.util.Arrays;

public class Recursion1 {

    void fun(){
        System.err.println(1);
        fun();
    }

    int count=1;
    void print(){
        System.out.print(count);
        count++;
        if(count==5) return;
        print();
        System.out.println(count--);
    }

    void namePrint(int n,int count){
        if(count>=n){
            return;
        }
        System.out.println("Dhananjay");
        namePrint(n,count+1);
    }

    void print1toN(int n,int i){
        if(i>n) return;
        System.out.println((i));
        print1toN(n, i+1);
    }

    void printNto1(int n){
        if(1>n) return;
        System.out.println(n);
        printNto1(n-1);
    }

    //BackTracking
    //print from 1 to N by using backtracking
    void f1toN(int n){
        if(n<1) return ;
        f1toN(n-1);
        System.out.println(n);
    }

    
    void fNto1(int n,int i){
        if(i>n) return;
        fNto1(n, i+1);
        System.out.println(i);
    }

    //Sum of numbers from 1 to N
    //By using parameterized
    void sum1toN(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        sum1toN(n-1, sum+n);
    }


    //Sum of 1 to N numbers
    //by using functional
    int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }

    int sum1(int i,int n){
        if(i>=n) return i;
        return i+sum1(i+1,n);
    }

    int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }

    int[] reversearray(int arr[],int i,int j){
        if(i>=j) return arr;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return reversearray(arr, i+1, j-1);
    }

    void swap(int arr[],int a,int b){
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
    int[] reversearray1(int arr[],int i){
        int n=arr.length-1;
        if(i>=arr.length/2) return arr;
        // int temp=arr[i];
        // arr[i]=arr[n-i];
        // arr[n-i]=temp;
        swap(arr,i,n-i);
        return reversearray1(arr, i+1);
    }

    Boolean stringpalidrome(String str,int i,int n){
        char[] ch=str.toCharArray();
        if(i>=n) return true;
        if(ch[i]!=ch[n-i-1])
             return false;
        return stringpalidrome(str, i+1, n);
    }

    //use multiple recursion call
    //finr nth fibonacci number example : 5th fin=bonacci is 3
    int fabonacciSeries(int n){
        if(n<=1) return n;
        return fabonacciSeries(n-1)+fabonacciSeries(n-2);
    }

    //print fibonacci series using for loop 
    int[] fabonacciSeries1(int n){
        int arr[]=new int[n];
        arr[0]=0;arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;

    }
        public static void main(String[] args) {
        Recursion1 r1=new Recursion1();

        // System.out.println(r1.fabonacciSeries(5));

        System.out.println(Arrays.toString(r1.fabonacciSeries(5)));
        int arr[]={1,2,3,4,5};
        String str="adaada";
        // System.out.println(r1.stringpalidrome(str, 0, str.length()));
        // System.out.println(Arrays.toString(r1.reversearray1(arr, 0)));
        // System.out.println(Arrays.toString(r1.reversearray(arr, 0, arr.length-1)));
        //System.out.println(r1.fact(5));
        //r1.fNto1(10,1);
    }
}
