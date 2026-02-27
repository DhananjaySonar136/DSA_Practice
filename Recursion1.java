public class Recursion1 {

    void fun(){
        System.err.println(1);
        fun();
    }

    int count=1;
    void print(){
        System.out.print(count);
        count++;
        if(count==5) return ;
        print();
        System.out.println(count--);
    }
    public static void main(String[] args) {
        Recursion1 r1=new Recursion1();
        r1.print();
    }
}
