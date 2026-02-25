import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MathBasics {

    //time complexity is logbase10(num) beacause num is divided by 10 
    int countdigit(int num){
        int count=0;
        while(num>0){
        int rem=num%10;
        count++;
        num=num/10;
        }
        return count;
    }

    int reverseNumber(int num){
         int revDigit=0;
        while(num>0){
           
            int lastdigit=num%10;
            num=num/10;
            revDigit=(revDigit*10)+lastdigit;
            
        }
        return revDigit;
    }

     Boolean palindrome(int num){
         int revDigit=0;
         int original=num;
        while(num>0){
           
            int lastdigit=num%10;
            num=num/10;
            revDigit=(revDigit*10)+lastdigit; //use to reverse number
            
        }
        System.err.println(revDigit);
        System.err.println(original);
        if(revDigit==original){
            return true;
        }
        return false;
    }

    Boolean arnStrong(int num){
        int original=num;
        int rev=0;
        int sum=0;
        while(num>0){
            int lastdigit=num%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
            num=num/10;  
        }
        if(sum==original) return true;
        else return false;
    }
    
    void printDivisors(int num){

        // int i=1;
        // while(i<=num){
        //     if(num%i==0){
        //         System.out.print(i+"  ");
        //     }
        //     i++;
        // }/

        List l=new ArrayList<>();
        for(int i=1;(i*i)<=num;i++){
            if(num%i==0){
                l.add(i);

                if(num/i!=i){
                    l.add(num/i);
                }
            }
        }
        Collections.sort(l);
        System.out.println(l);
    }

    void prime(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                System.out.println(count);
                
                //if we dont write this below if then below if should be (count==1)
                if(n/i!=i){
                    count++;
                    System.out.println("inner if: "+count);
                }
            }
        }
        if(count==2) System.out.println("prime");
        else System.out.println("not prime");
    }

    //GCD(a,b) a should be greater then gcd(a-b,b) OR gcd(a%b,b)
    void findGCD(int n1,int n2){
        // int num1=Math.min(n1,n2);
        // int num2=Math.max(n1,n2);
        // int HCF=1;
        // for(int i=1;i<=num1;i++){
        //     if(num1%i==0){
        //         if(num2%i==0){
        //             HCF=i;
        //         }
        //     }
        // }
        // System.out.println("HCF :"+HCF);

        //ORRRRRRRRRRRR #####################################

        // while(0<n1 && 0<n2){
        //     if(n1>n2){
        //         n1=n1-n2;
        //     }
        //     else{
        //         n2=n2-n1;
        //     }
        // }
        // if(n1==0){
        //     System.out.println(n2);
        // }
        // else{
        //     System.out.println(n1);
        // }


        //ORRRRRRRRRRRRRRRRRRRR ########################################

        //Time Complexity will be O(log i min(n1,n2)) 
        //why log ? beacause where there is division there will be log and by which we divide it will be base of log
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }
        if(n1==0){
            System.out.println(n2);
        }
        else{
            System.out.println(n1);
        }

    }
    public static void main(String[] args) {
        MathBasics m=new MathBasics();
        m.findGCD(105, 15);
        // m.prime(9);
        // m.printDivisors(13);
        // System.out.println(m.arnStrong(153));
        // System.out.println(m.palindrome(121));
        // System.out.println(m.reverseNumber(121));
        //System.err.println(m.countdigit(123456));

    }
}
