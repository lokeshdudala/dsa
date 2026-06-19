import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	   String str[]=new String[n]; 
	   for(int i=0;i<n;i++){
	       str[i]=sc.next();
	   }
	   String ans="";
	   for(int i=0;i<str[0].length();i++){
	       char ch=str[0].charAt(i);
	       for(int j=1;j<n;j++){
	           if(i>=str[j].length() || str[j].charAt(i)!=ch){
	               System.out.println(ans);
	               return;
	           }
	       }
	       ans+=ch;
	   }
	   System.out.println("longest common"+ans);
	}
}