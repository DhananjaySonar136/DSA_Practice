package Arrays3;

import java.util.Arrays;

class Seperate0and1 {
    void segregate0and1(int[] arr) {
        
        int i=0;
        int j=arr.length-1;
        while(i<j){
            
            if(i==0){
                i++;
            }
            else if(i==1){
                System.err.println("inside else if");
                if( j==0 ){

                   
                    int temp=arr[i];
                     System.out.println("temp :"+temp);
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else{
                    j--;
                }
            }
            
        }

        System.out.println("After segregation: ");
        System.err.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Seperate0and1 s=new Seperate0and1();
        int[] arr={0,0,1,0,0};
        s.segregate0and1(arr);
    }
}