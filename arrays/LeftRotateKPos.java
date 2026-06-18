import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr n");
		int n=sc.nextInt();
		System.out.println("eneter k postions to rotae");
		int k=sc.nextInt();
		System.out.println("eneter elements into array");
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    
		}
		for(int i=0;i<n;i++){
		    b[i]=a[(i+k)%n];
		}
		for(int i=0;i<n;i++){
		    System.out.print(b[i]+" ");
		}
	}
}