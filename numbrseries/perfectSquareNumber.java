import java.io.*;
import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=(int)Math.sqrt(n);
        if(m*m==n){
            System.out.println("perferct square   number");
        }
        else{
            System.out.println("Not a perfect");
        }
   
   

    }
}
