import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr n");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int [n+n];
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
		    c[k]=a[i];
		    k++;
		}
	
for(int i=0;i<n;i++){

    int j;
    for(j=0;j<k;j++){
        if(b[i]==c[j])
            break;
    }

    if(j==k){
        c[k]=b[i];
        k++;
    }
}
for(int i=0;i<k;i++){
    System.out.print(c[i]+" ");
}
		
		
	}
}