import java.io.*;
import java.util.*;
class Main {
    public static void main(String args[]) {
        int n = 999;
        int count = 0;
        boolean flag=true;
   int rem=n%10;
   while(n!=0){
       int div=n%10;
       if(rem!=div){
           flag=false;
           break;
       }
       n/=10;
   }
   if(flag){
       System.out.println("nelson");
   }
   else{
       System.out.println("not");
   }
   

    }
}
