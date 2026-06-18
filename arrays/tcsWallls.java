/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("interio no of wall'");
		int interior=sc.nextInt();
		int inter[]=new int[interior];
		System.out.println("exetrerio no of wall'");
		int exterior=sc.nextInt();
		int exe[]=new int[exterior];
		int intsum=0;
		int extsum=0;
	
		if(interior>0){
		    for(int i=0;i<interior;i++){
		        	System.out.println("interio no of wall'"+i);
		        inter[i]=sc.nextInt();
		           intsum+=inter[i];
		        
		    }
		}
		if(exterior>0){
		    for(int i=0;i<exterior;i++){
		        System.out.println("exetrerio no of wall'"+i);
		        exe[i]=sc.nextInt();
		          extsum+=exe[i];
		        
		    }
		}
		
		int cost=((intsum*18)+(extsum*12));
		System.out.println(cost);
	}
}