import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter size of window :");
        int k = sc.nextInt();

        int i =0,j=0,sum=0;
        int maxSum = Integer.MIN_VALUE;
        while(j< arr.length){
        int win = j-i+1;
            sum += arr[j];
            if(win  == k){
                maxSum = Math.max(sum,maxSum);
                sum-=arr[i];
                i++;
                j++;
            }else if(k>win){
                j++;
            }
        }
        System.out.println(maxSum);
    }
}
