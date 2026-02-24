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
    
    public static void main(String[] args) {
        MathBasics m=new MathBasics();
        System.out.println(m.arnStrong(153));
        // System.out.println(m.palindrome(121));
        // System.out.println(m.reverseNumber(121));
        //System.err.println(m.countdigit(123456));

    }
}
