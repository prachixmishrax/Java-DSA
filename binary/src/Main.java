//decimal to binary
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            int num = i;
            String ans = " ";
            while (num != 0) {
                int rem = num % 2;
                num = num / 2;
                ans = rem + ans;

            }
        System.out.println(ans);
        }
    }
    }
