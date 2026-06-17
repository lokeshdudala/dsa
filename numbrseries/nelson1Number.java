import java.io.*;
import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n;
        int m=(int)Math.pow(n,2);
        int sum=0;
    while(m>0){
        int digit=m%10;
        sum+=digit;
        m/=10;
        
        
    }
    if(sum==c){
        System.out.println("neon");
    }
    else{
        System.out.println("not a neon");
    }
   

    }
}
