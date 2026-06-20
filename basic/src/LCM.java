import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int i = 1;
            int lcm=1;
            while(num1!=i)

            {
                if (num1 % i == 0 && num2 % i == 0) {
                    lcm *=i;
                }
            }
        }
    }
}
