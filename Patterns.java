public class Patterns {

/* 
    *  *  *  * 
    *  *  *  *
    *  *  *  *
    *  *  *  *
 */
    void ptn1(int n){
        //i is for no.s of rows
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    void ptn2(int rows){
        for(int i=0;i<=rows;i++){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Patterns p=new Patterns();
        p.ptn2(5);
        //p.ptn1(5);
    }
}
