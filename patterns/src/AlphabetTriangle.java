import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
        char alpha = 'A';
            for(int j = 1; j<=i; j++){
                System.out.print(alpha + " ");
                alpha++;
            }
            System.out.println();
        }
    }
}
