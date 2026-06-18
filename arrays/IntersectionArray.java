import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr n");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int [n*n];
		int k=0;
		System.out.println("enetr n");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		System.out.println("enetr n");
	for(int i=0;i<n;i++){
		    b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if(a[i]==b[j]){
		            c[k++]=a[i];
		            b[j]=-1;
		            break;
		        }
		    }
		}
		for(int i=0;i<c.length;i++){
		    if(c[i]!=0)
		    System.out.print(c[i]+" ");
		}
	}
}