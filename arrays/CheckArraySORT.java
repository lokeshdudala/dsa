import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr array size");
	int n=sc.nextInt();
	int a[]=new int[100];
	boolean sort=true;

	System.out.println("enter elemests");
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}
	for(int i=0;i<n-1;i++){
	   if(a[i]>a[i+1]){
	       sort=false;
	       break;
	   }
	}
if(sort){
    System.out.println("true");
}
else{
    System.out.println("false");
}


}
}