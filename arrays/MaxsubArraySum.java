import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int currentsum=a[0];
        int maxsum=a[0];
        for(int i=1;i<n;i++){
            currentsum=Math.max(a[i],currentsum+a[i]);
            maxsum=Math.max(maxsum,currentsum);
        }
        System.out.println("maxsum"+maxsum);
       
	}
}
