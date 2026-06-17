import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        for(int i=min;i<=max;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if((i%j)==0){
                    count+=1;
                }
            }
            if(count==2){
                System.out.println(i+" ");
            }
        }
       
         
     }
}