import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = n; i>=1; i--){
            for( int sp =1; sp<= n-i; sp++){
                System.out.print(" ");
            }
            for( int j = 1 ; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}