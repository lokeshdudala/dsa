public import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String words[]=s.split(" ");
		String rev="";
		for(int i=words.length-1;i>=0;i--){
		    rev+=words[i]+" ";
		}
	 System.out.println(rev);
    }
	
} 
