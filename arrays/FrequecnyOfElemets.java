<<<<<<< HEAD
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=0;
	int a[]=new int[n];
	int[] visit = new int[n];
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	     visit[i] = 0;
	}
	for(int i=0;i<n;i++){
	   if(visit[i]==0){
	       int count=1;
	   for(int j=i+1;j<n;j++){
	       if(a[i]==a[j]){
	           count++;
	           visit[j]=1;
	       }
	   }
	   
	       System.out.println(a[i]+" "+count);
	   }
	   }
	  
	}
}
=======
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=0;
	int a[]=new int[n];
	int[] visit = new int[n];
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	     visit[i] = 0;
	}
	for(int i=0;i<n;i++){
	   if(visit[i]==0){
	       int count=1;
	   for(int j=i+1;j<n;j++){
	       if(a[i]==a[j]){
	           count++;
	           visit[j]=1;
	       }
	   }
	   
	       System.out.println(a[i]+" "+count);
	   }
	   }
	  
	}
}
>>>>>>> fd3aeda8afbc7d68b009af8ef57e40a169cfee71
