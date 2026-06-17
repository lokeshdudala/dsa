import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mul=1;
        int sum=0;
    while(n>0){
        int rem=n%10;
        sum+=rem;
        mul*=rem;
        n/=10;
    }
    if(sum==mul){
        System.out.println("Spy number");
    }
    else{
        System.out.println("Not spy");
    }
    }
}