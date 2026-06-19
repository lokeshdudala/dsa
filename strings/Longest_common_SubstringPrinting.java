import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashSet<Character> set=new HashSet<>();
		int left=0;
		int max=0;
		int start=0;
		for(int right=0;right<s.length();right++){
		    while(set.contains(s.charAt(right))){
		        set.remove(s.charAt(left));
		        left++;
		    }
		    set.add(s.charAt(right));
		       if (right - left + 1 > max) {
                max = right - left + 1;
                start = left;
            }
        
		}
		System.out.println(max);
	 System.out.println("Substring = " + s.substring(start, start + max));
    }
	
}
