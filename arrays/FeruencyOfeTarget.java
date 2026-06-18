import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer>map=new HashMap<>();
		int n=sc.nextInt();
		int k=1;
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    if(a[i]==k){
		        count++;
		    }
		}
		
		System.out.print("frequecy of elemt"+k+" "+count);
	}
	
}
