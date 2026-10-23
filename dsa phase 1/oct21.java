public class oct21 {

    public static void main(String[] args) {
        int n=4;
        // upper part 

        for(int i=0; i<=n; i++){
            //stars
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("*");
            
            // space
            int space =2*(n-i);
            for( int j=0; j<space; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        // lower part
            for(int i=n; i>=0; i--){
                 //stars
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("*");
            
            // space
            int space =2*(n-i);
            for( int j=0; j<space; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

            
        }


        // question2 
        int m=5;
        for(int i=0;i<=m;i++){
           // space 
           for( int j=0;j<=m-i;j++){
            System.out.print(" ");
           }
           //stares
           for(int j=0;j<=5;j++){
            System.out.print("*");

           }
           System.out.println();
        }
        

    }
}