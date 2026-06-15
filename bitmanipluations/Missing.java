import java.util.*;

class Main {
    public static void main(String[] args) {

        int nums[] = {3, 0, 1};

        int xor = 0;
        int n = nums.length;

        for(int i = 0; i <= n; i++) {
            xor ^= i;
        }

        for(int i = 0; i < n; i++) {
            xor ^= nums[i];
        }

        System.out.println(xor);
    }
}