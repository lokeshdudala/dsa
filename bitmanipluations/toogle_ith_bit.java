import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     
      int i=2;
      int result= n^ (1<<i);
      System.out.println(result);
}
}
