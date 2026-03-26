package Arrays3;

public class MissingNuber {
    
    int missing(){
        int arr[]={1,3,4,5,6};
        int n=arr.length;
        System.err.println(n+1);
        int sum= (arr[n-1] * (arr[n-1]+1))/2;
        System.out.println(sum);

        int total =0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        System.out.println(total);
        return sum-total;
    }
    public static void main(String arg[]){

        MissingNuber mn=new MissingNuber();
       System.err.println(mn.missing());
        

    }
}
