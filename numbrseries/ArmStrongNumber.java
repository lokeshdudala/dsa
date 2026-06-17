import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int sum=0;
        int temp=n;
        int temp1=n;
        int count=0;
        
         while(temp1>0){
             int dit=temp1%10;
             rev=rev*10+dit;
             count=count+1;
            temp1/=10;
             
         }
         while(temp>0){
             int dit=temp%10;
             sum+=Math.pow(dit,count);
             temp/=10;
         }
         if(n==sum){
             System.out.println("Amstrongnumber");
         }
         else{
             System.out.println("not");
         }
     }
}