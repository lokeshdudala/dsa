
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr n");
		HashMap<Integer,Integer> map=new HashMap<>();
		
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enetr n");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
	for(int num:a){
	    	    map.put(num,map.getOrDefault(num,0)+1);
	    if(map.get(num) > n / 2) {
	   
	
	System.out.println("Majority Element: " + num);
                return;
	}
	}
	
		    System.out.println("not found");
		
	
	}
}
