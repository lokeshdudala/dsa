import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
	
	
		int nums[]=new int[n];
		System.out.println(" enetr elemest");
		for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int i=0;
       for(int j=1;j<n;j++){
           if(nums[i]!=nums[j]){
           i++;
           nums[i]=nums[j];
       }
       }
       System.out.println("Length"+ (i + 1));

        for(int k = 0; k <= i; k++) {
            System.out.print(nums[k] + " ");
       
        }
	}
}