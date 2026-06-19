import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch=='(' || ch=='[' || ch=='{'){
		        st.push(ch);
		    }
		    else{
		        if(st.isEmpty()){
		            System.out.println("false");
		            return;
		        }
		        char top=st.peek();
		        if(ch==')' && top=='(' ||
		           ch=='}' && top== '{' ||
		           ch==']' && top=='['){
		               st.pop();
		           }
		            else {
                    System.out.println(false);
                    return;
                }
		    }
		     
		}
		     if (st.isEmpty()) {
            System.out.println("true");
		     }
        
        else {
            System.out.println("false");
        
		}
	}
} {
    
}
