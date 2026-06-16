import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
           
     for(int i=0;i<n;i++){
         int a=i;
            int rev=0;
            int temp=i;
         while(temp>0){
             int dit=temp%10;
             rev=rev*10+dit;
            temp/=10;
             
         }
         if(a==rev){
             System.out.println(a+" ");
         }
     }
     }
}