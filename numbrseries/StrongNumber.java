import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
while(n>0){
    int fact=1;
    int digit=n%10;
  
    for(int i=1;i<=digit;i++){
        fact*=i;
    }  
    
      sum+=fact;
      n/=10;
}
if(sum==temp){
    System.out.println("Strong number");
}
else{
    System.out.println("not");
}
       
         
         
     }
}