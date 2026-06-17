import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=1;j<=n;j++){
      
        int sum=0;
   for(int i=1;i<j;i++){
        
            if(j%i == 0){
               sum+=i;
}
}
        if(sum==j){
            System.out.println(j+"");
        }
        
        }
       
         
         
     }
}