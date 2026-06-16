import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       while(n>9){
           int sum=0;
           while(n>0){
           int digit=n%10;
            sum+=Math.pow(digit,2);
           n/=10;
       }
       n=sum;
       }
       if(n==1){
           System.out.println("Happy Number");
       }
       else{
           System.out.println("No");
       }
       
       
         
     }
}