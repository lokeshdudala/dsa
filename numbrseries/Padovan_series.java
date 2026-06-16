import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        int n=10;
        int a=1;
        int b=1;
        int c=1;
        System.out.print(a+" "+b+" "+c+" ");
        for(int i=1;i<=n;i++){
            int d=a+b;
            a=b;
            b=c;
            c=d;
            System.out.print(d+" ");
        }
        
    }
}
