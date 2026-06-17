import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	for(int i=1;i<=2*n;i++){
	    int total=i>n?2*n-i:i;
	    int s=n-total;
	    for(int j=1;j<=s;j++){
	        System.out.print(" ");
	    }
	    for(int j=1;j<=2*total-1;j++){
	         if(j == 1 || j == 2 * total - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
	    
	   
	    System.out.println();
	}
		
		}
}
