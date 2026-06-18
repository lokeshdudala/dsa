<<<<<<< HEAD
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr array size");
	int n=sc.nextInt();
	int a[]=new int[100];
	boolean[] visited = new boolean[n];

	System.out.println("enter elemests");
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}

	     for (int i = 0; i < n - 1; i++) {
	         if(!visited[i]){
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    visited[j]=true;
                    isDuplicate = true;
                    
                }
            }
            if (isDuplicate) {
                System.out.println("Duplicate"+a[i]);
            }
	         }
}

}
=======
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr array size");
	int n=sc.nextInt();
	int a[]=new int[100];
	boolean[] visited = new boolean[n];

	System.out.println("enter elemests");
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}

	     for (int i = 0; i < n - 1; i++) {
	         if(!visited[i]){
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    visited[j]=true;
                    isDuplicate = true;
                    
                }
            }
            if (isDuplicate) {
                System.out.println("Duplicate"+a[i]);
            }
	         }
}

}
>>>>>>> fd3aeda8afbc7d68b009af8ef57e40a169cfee71
}