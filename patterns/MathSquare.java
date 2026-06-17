
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int original=n;
		n=n*2;
		for(int i=0;i<=n;i++){
		    for(int j=0;j<=n;j++){
		        int everyIndex=original-Math.min(Math.min(i,j),Math.min(n-i,n-j));
		        System.out.print(everyIndex+" ");
		    }
		    System.out.println("");
		}
		}
}