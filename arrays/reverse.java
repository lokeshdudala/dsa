<<<<<<< HEAD
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int left=0;
	int right=n-1;
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}
	while(left<right){
	    int temp=a[left];
	    a[left]=a[right];
	    a[right]=temp;
	    left++;
	    right--;
	}

		for(int i=0;i<n;i++){
	   System.out.print(a[i]+" ");
		}
	
}
=======
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int left=0;
	int right=n-1;
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}
	while(left<right){
	    int temp=a[left];
	    a[left]=a[right];
	    a[right]=temp;
	    left++;
	    right--;
	}

		for(int i=0;i<n;i++){
	   System.out.print(a[i]+" ");
		}
	
}
>>>>>>> fd3aeda8afbc7d68b009af8ef57e40a169cfee71
}