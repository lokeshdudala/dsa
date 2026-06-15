<<<<<<< HEAD
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      while (n > 0) {
            n = n & (n - 1);
            count++;
        }
      System.out.println(count);
}
}
=======
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      while (n > 0) {
            n = n & (n - 1);
            count++;
        }
      System.out.println(count);
}
}
>>>>>>> 1a588bba351174eea584bc65636eee736976cc74
