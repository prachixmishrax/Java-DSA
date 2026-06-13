import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pair {
    public static void main(String[] args) {
        int arr[] = {10,20,5,13,11};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int n = 25;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if( arr[i] + arr[j] == n) {
                    System.out.println("yes");
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }
}