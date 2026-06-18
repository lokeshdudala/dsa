import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr array size");
	int n=sc.nextInt();
	int a[]=new int[100];
	System.out.println("pos");
	int pos=sc.nextInt();

	System.out.println("enter elemests");
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}
	for(int i=pos;i<n-1;i++){
	   a[i]=a[i+1];
	}
	n--;
		System.out.println("After elemests");
	for(int i=0;i<n;i++){
	    System.out.print(a[i]+" ");
	}

}
}