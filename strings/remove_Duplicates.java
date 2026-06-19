import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
	 for(int i=0;i<s.length();i++){
	     int count=0;
	     for(int j=0;j<i;j++){
	         if(s.charAt(i)==s.charAt(j)){
	             count++;
	             break;
	         }
	     }
	     if(count==0){
	         System.out.print(s.charAt(i));
	     }
	 }
	 
    }
	
}