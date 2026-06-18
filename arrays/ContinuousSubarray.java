import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;

        boolean found = false;

        for(int i = 0; i < nums.length; i++) {

            int sum = 0;

            for(int j = i; j < nums.length; j++) {

                sum += nums[j];

                if(j - i + 1 >= 2 && sum % k == 0) {
                    found = true;
                    break;
                }
            }

            if(found) break;
        }

        System.out.println(found);
    }
}
