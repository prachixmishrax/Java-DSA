import java.util.Scanner;

public class SumRange {
    public static void main(String[] args) {
        int[] arr = {1,7,8,44,6,33,5};
         Scanner sc = new Scanner(System.in);
         int s = sc.nextInt();
        int e = sc.nextInt();
        int sum =0;
        for (int i = s; i <=e ; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
