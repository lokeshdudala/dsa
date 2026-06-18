import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
int a[]=new int[n];
int zerocount=0;
int poszero=0;
int neg=0;
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
    if(a[i]==0){
        zerocount++;
    }
    else if(a[i]>0){
        poszero++;
    }
    else{
        neg++;
    }
}
System.out.println("zero count"+" "+ zerocount);
System.out.println("pos count"+" "+ poszero);
System.out.println("neg countt"+" "+ neg);
	  
	}
}
