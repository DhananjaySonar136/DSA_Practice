public class MathBasics {

    int countdigit(int num){
        int count=0;
        while(num>0){
        int rem=num%10;
        count++;
        num=num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        MathBasics m=new MathBasics();
        System.err.println(m.countdigit(123456));

    }
}
