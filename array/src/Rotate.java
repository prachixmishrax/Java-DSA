import java.util.Scanner;
//rotate the array
public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        int n = 4;


        reverse(arr,0,n-1);
        reverse(arr,n, arr.length-1);
        reverse(arr,0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    static void reverse(int[] arr,int s,int e){
       while (s<e){
           int temp = arr[s];
           arr[s] = arr[e];
           arr[e]=temp;
           s++;
           e--;
       }
    }
}
