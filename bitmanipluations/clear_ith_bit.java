
import java.util.*;

class Main {
    public static void main(String[] args) {
        int n = 14;
        int i = 2;

        int result = n & ~(1 << i);

        System.out.println(result);
    }
}
