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
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    void ptn3(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void ptn4(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    void ptn5(int rows){
        // for(int i=1;i<=rows;i++){
        //     for(int j=1;j<=rows-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //ORRRRRRRRR
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void ptn6(int rows){
        for(int i=0;i<rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        Patterns p=new Patterns();
        p.ptn6(5);
        //p.ptn5(5);
        //p.ptn4(5);
        // p.ptn3(5);
        //p.ptn2(5);
        //p.ptn1(5);
    }
}
