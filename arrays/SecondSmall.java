import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ssmall=Integer.MAX_VALUE;
	int small=Integer.MAX_VALUE;
	int a[]=new int[n];
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
	    if(a[i]<small){
	        ssmall=small;
	        small=a[i];
	    }
	
	    else if(a[i]!=small&&a[i]<ssmall){
	        ssmall=a[i];
	    }
	}
	System.out.println(small+" "+ ssmall);
}
}