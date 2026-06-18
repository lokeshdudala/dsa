import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int max=Integer.MIN_VALUE;
	int smax=Integer.MIN_VALUE;
	int a[]=new int[n];
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
	    if(a[i]>max){
	        smax=max;
	        max=a[i];
	    }
	
	    else if(a[i]!=max&&a[i]>smax){
	        smax=a[i];
	    }
	}
	System.out.println(max+" "+ smax);
}
}