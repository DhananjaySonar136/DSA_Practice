import java.util.Arrays;

public class printN_1_recursion {
    // public static void printNumbers(int n) {
    //     if(n>=1){
            
    //         printNumbers(n-1);
    //         System.out.println(n);
    //     }
    // }

    // public static void printNumbers(int n,int i) {
    //     if(i==n+1){
    //         return;
    //     }
    //     System.out.println("Before Method Calling :"+i);
    //     printNumbers(n ,i+1);
    //     System.out.println(i);
    // }

    // public static void sum1_n(int n,int sum) {
    //     if(n<1){
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum=sum+n;
    //     sum1_n(n-1, sum);
    // }


    // public static int sum1_n(int n,int sum) {
    //     if(n<1){
    //         return sum;
    //     }
    //     sum=sum+n;
    //     return sum1_n(n-1, sum);
    // }  


    // public static int print_n_1(int n) {
    //     if(n<1){
    //         return 0;
    //     }
    //     System.out.println(n);
    //     return print_n_1(n-1);
    // } 

    // public static int print_1_n(int n,int i) {
    //     if(n<1){
    //         return 0;
    //     }
    //     System.out.println(i);
    //     return print_1_n(n-1,i+1);
    // } 

    // public static void reversearr(int arr[],int i,int j) {
    //     if(i>=j){
    //         return;
    //     }
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;

    //     reversearr(arr, i+1, j-1);
    // } 


    public static String paliString(String str,int i,int j) {
        if(i>j){
            return "Palindrom";
        }

        System.out.println(str.charAt(i));
        System.out.println(str.charAt(j));
        System.out.println("---------------------");

        if((str.charAt(i)) != (str.charAt(j))){
            return "Not a palindrome";
        }
       return paliString(str, i+1, j-1);
    } 


    static int fib(int n){        
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }


    

    public static void main(String[] args) {
        printfib(5);
    }
}
