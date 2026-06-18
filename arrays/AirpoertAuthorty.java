<<<<<<< HEAD
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr the no of lauges");
		int l=sc.nextInt();
			System.out.print("enetr thrsold");
			int cost=0;
		int thresold=sc.nextInt();
		int la[]=new int[l];
		if(l>0){
		    for(int i=0;i<l;i++){
		        System.out.print("enter weight "+" "+ i);
		        la[i]=sc.nextInt();
		}
}
for(int i=0;i<l;i++){
    if(la[i]>thresold){
        cost+=2;
    }
    else{
        cost+=1;
    }
    
}
System.out.println(cost);
}
=======
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr the no of lauges");
		int l=sc.nextInt();
			System.out.print("enetr thrsold");
			int cost=0;
		int thresold=sc.nextInt();
		int la[]=new int[l];
		if(l>0){
		    for(int i=0;i<l;i++){
		        System.out.print("enter weight "+" "+ i);
		        la[i]=sc.nextInt();
		}
}
for(int i=0;i<l;i++){
    if(la[i]>thresold){
        cost+=2;
    }
    else{
        cost+=1;
    }
    
}
System.out.println(cost);
}
>>>>>>> fd3aeda8afbc7d68b009af8ef57e40a169cfee71
}