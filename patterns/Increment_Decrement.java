import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	for(int i=1;i<=2*n;i++){
	    int total=i>n?2*n-i:i;
	    for(int j=1;j<=total;j++){
	        System.out.print("*");
	    }
	   
	    System.out.println();
	}
		
		}
}
