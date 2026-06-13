import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
//        int sum = 0;
        int []arr = new int[n];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            arr [i]= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max);
//        System.out.println(sum);

    }
}
