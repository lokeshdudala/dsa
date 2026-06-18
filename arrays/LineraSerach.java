<<<<<<< HEAD
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int a[]=new int[n];
		boolean found=false;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    if(a[i]==target){
		        found=true;
		        break;
		    }
		}
		if(found){
		    System.out.println("ture");
		}
		else{
		    System.out.println("false");
		}
	}
=======
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int a[]=new int[n];
		boolean found=false;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    if(a[i]==target){
		        found=true;
		        break;
		    }
		}
		if(found){
		    System.out.println("ture");
		}
		else{
		    System.out.println("false");
		}
	}
>>>>>>> fd3aeda8afbc7d68b009af8ef57e40a169cfee71
}