import java.util.*;

public class DividePrinting {

    public static void main(String[] args) {
        int[] arr ={2 ,8, 6, 3, 4, 1, 7};

        int n= arr.length-1;
        divideHelp(arr,0,n);

    }
    public static void divideHelp(int arr[],int l,int r) {
        if(l<r){
            for (int i = l; i <=r ; i++) {
                System.out.print(arr[i]+" ");

            }
            System.out.println();
            int mid =(l+r)/2;
            divideHelp(arr, l, mid);
            divideHelp(arr, mid+1, r);
        }
        if (l==r) {
            for (int i = l; i <=r ; i++) {
                System.out.print(arr[i]+" ");

            }
            System.out.println();

        }

    }
}
