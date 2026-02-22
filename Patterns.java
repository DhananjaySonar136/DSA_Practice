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

    void ptn7(int rows){
        for(int i=0;i<rows;i++){
            //space
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }

            //stars printing
            for(int k=0;k<(i*2+1);k++){
                System.out.print("*");
            }

             for(int j=0;j<rows-i-1;j++){
                System.out.print("_");
            }
            System.out.println();
        }
    }

    void ptn8(int rows){
        for(int i=rows-1;i>=0;i--){
            //space
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }

            //stars printing
            for(int k=0;k<(i*2+1);k++){
                System.out.print("*");
            }

            //space (optional here)
             for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        //OR

        for(int i=0;i<rows;i++){
            //space
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }

            //stars printing
            for(int k=0;k<(rows*2)-(i*2+1);k++){
                System.out.print("*");
            }

            //space (optional here)
             for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void ptn9(int rows){
        //Half Pattern
        for(int i=0;i<rows;i++){

            //spaces
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Half Pattern
        for(int i=0;i<rows;i++){
            //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //stars
            for(int j=0;j<rows*2 - i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void ptn10(int rows){
        // //Half Pattern
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<i+1;j++){
        //         System.err.print("*");
        //     }
        //     System.err.println();
        // }

        // //Half Pattern
        // for(int i=0;i<rows-1;i++){
        //     for(int j=0;j<rows-i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //ORRRRRRRRRR

        for(int i=1;i<=rows;i++){
            int stars=i;
            
            if(i>5) stars=rows-i+1;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }

    void ptn11(int rows){
        int start=1;
        for(int i=0;i<rows;i++){

            //IF row is even then start with 1 otherwise 0
            if(i%2==0) start=1;
            else start=0;

            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start; //make 1 to 0 and 0 to 1
            }
            System.err.println();
        }
    }

    void ptn12(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            //spaces
            for(int k=0;k<(rows*2)-(i*2);k++){
                System.out.print(" ");
            }

            for(int l=i;l>=1;l--){
                System.out.print(l);
            }
            System.err.println();
        }
    }
    
    void ptn13(int rows){
        int start=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                 System.out.print(start+" ");
                 start++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Patterns p=new Patterns();
        p.ptn13(5);
        // p.ptn12(4);
        // p.ptn11(5);
        // p.ptn10(9);
        //p.ptn9(5);
        //p.ptn8(5);
        // p.ptn7(5);
        // p.ptn6(5);
        //p.ptn5(5);
        //p.ptn4(5);
        // p.ptn3(5);
        //p.ptn2(5);
        //p.ptn1(5);
    }
}
