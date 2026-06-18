import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("k");
		int k=sc.nextInt();
		int a[]=new int[n];
		System.out.println(" enetr elemest");
		for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int currentsum=0;
        	for(int i = 0; i < k; i++){
           currentsum+=a[i];
        }
        
        int maxsum=currentsum;
        for(int i=k;i<n;i++){
            currentsum=currentsum-a[i-k]+a[i];
            maxsum=Math.max(maxsum,currentsum);
        }
        System.out.println("maxsum "+maxsum);
       
