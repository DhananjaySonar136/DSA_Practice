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


        public static void main(String[] args) {
        Recursion1 r1=new Recursion1();
        r1.fNto1(10,1);
    }
}
