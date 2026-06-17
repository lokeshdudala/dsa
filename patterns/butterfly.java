<<<<<<< HEAD


class Main {
    public static void main(String[] args) {
        int n=8;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=2*n;j++){
               if(j>i && j<=2*n-i){
                   System.out.print(" ");
               }
               else{
                   System.out.print("*");
               }
           }
           System.out.println();
       }  
        for(int i=n-1;i>=1;i--){
           for(int j=1;j<=2*n;j++){
               if(j>i && j<=2*n-i){
                   System.out.print(" ");
               }
               else{
                   System.out.print("*");
               }
           }
           System.out.println();
       } 
    }
}
=======


class Main {
    public static void main(String[] args) {
        int n=8;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=2*n;j++){
               if(j>i && j<=2*n-i){
                   System.out.print(" ");
               }
               else{
                   System.out.print("*");
               }
           }
           System.out.println();
       }  
        for(int i=n-1;i>=1;i--){
           for(int j=1;j<=2*n;j++){
               if(j>i && j<=2*n-i){
                   System.out.print(" ");
               }
               else{
                   System.out.print("*");
               }
           }
           System.out.println();
       } 
    }
}
>>>>>>> 83b3ebcba0d38492d0c1da1053badabc0ed4e979
