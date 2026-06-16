import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
while(n>0){
   
    int digit=n%10;
    sum+=digit;
    n/=10;
}
if((temp%sum)==0){
    System.out.println("Nyvon Numbver");
    
}
else{
    System.out.println("Nota Number");
}
  
    
         
         
     }
}