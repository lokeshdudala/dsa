
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n;i++){
		    
		    if(i%2!=0 ){
		        a[i]=i;
		}
		}
		for(int i=0;i<n;i++){
		    if(a[i]==0){
		    System.out.print(a[i]+" ");
		    }
		}
		/*
		System.out.print(i%2==0?i:" ");
        */
		}
	}
}
