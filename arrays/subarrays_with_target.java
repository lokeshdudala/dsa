import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
	System.out.println("target");
	int k=sc.nextInt();
	int count=0;
		int nums[]=new int[n];
		for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
            
            if(sum==k){
                count++;
            }
        }
        }
        System.out.print(count);
      
	}
}