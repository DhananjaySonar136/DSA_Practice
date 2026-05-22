//count each alphabet from given String
// a b d f a d f z
public class Hashing {
    
//this is only for lowercase letters
    // void count(String str,int size){
    //     int ch[]=new int[size];
    //     ch[0]=0;
    //     for(int i=0;i<str.length();i++){

    //         char c=str.charAt(i);

    //         ch[c-'a']=ch[c-'a']+1;
    //     }

    //     System.out.println(ch['a'-'a']);
    //     System.out.println(ch['b'-'a']);
    //     System.out.println(ch['d'-'a']);
    //     System.out.println(ch['f'-'a']);
    //     System.out.println(ch['z'-'a']);
    //     System.out.println(ch['s'-'a']);
    // }


    void count2(String str){
        int ch[]=new int[255];
        ch[0]=0;
        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);

            ch[c]=ch[c]+1;
        }

        System.out.println(ch['a']);
        System.out.println(ch['b']);
        System.out.println(ch['d']);
        System.out.println(ch['f']);
        System.out.println(ch['z']);
        System.out.println(ch['s']);
    }
    public static void main(String[] args) {
        Hashing h=new Hashing();
        //h.count("abdfadfz",26);
        h.count2("abdfadfz");
    }
}
