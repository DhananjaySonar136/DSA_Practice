public class Recursion1 {

    void fun(){
        System.err.println(1);
        fun();
    }

    
    public static void main(String[] args) {
        Recursion1 r1=new Recursion1();
        r1.print();
    }
}
