import java.util.Scanner;

public class ArmstrongNumber {
        static boolean armstrongNumber(int n) {
            // code here
            int temp=n;
            int armstrong=0;
            while(temp!=0){
                int digit=temp%10;
                armstrong+= (digit*digit*digit);
                temp=temp/10;

            }
            if(armstrong==n)return true;
            return false;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrongNumber(n));
    }
    }
