class Main {
    public static void main(String[] args) {

        int n = 13;
        int ans = 0;

        for(int i = 0; i < 32; i++) {
            int bit = n & 1;

            ans = (ans << 1) | bit;

            n = n >>> 1;
        }

        System.out.println(ans);
    }
}
