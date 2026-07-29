
import java.util.Arrays;

import java.util.Scanner;

public class MaxEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
//        min(arr);
//        max(arr);
//        linearSearch(arr,6);
//        secondLarg(arr);
//        isSorted(arr);
//        reverse(arr);
//        diff(arr);
        deleteSmallest(arr);
    }
    static void max(int[] arr){
        int max = arr[0];
        for (int val : arr){
            if(max<val){
                max = val;
            }
        }
        System.out.println(max);
    }
    static void min(int[] arr){
        int min = arr[0];
        for (int val : arr){
            if(min>val){
                min = val;
            }
        }
        System.out.println(min);
    }
    static void linearSearch(int[] arr , int target){
        for(int val : arr){
            if(val==target){
                System.out.println("found");
                return;
            }

        }
        System.out.println("not found");
    }
    static void smax(int[] arr){
        int max = arr[0];
        int secmax= Integer.MIN_VALUE;
        for (int val : arr){
            if(max<val){
                max = val;
            }

        }
        for(int val : arr){
            if((secmax<val)&&(val!=max)){
                secmax = val;
            }
        }
        System.out.println(secmax);
    }
    public static void secondLarg(int[]arr){
        int lar = arr[0];
        int n = arr.length;
        int seclar = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]> lar){
                seclar = lar;
                lar = arr[i];
            }else if(arr[i]>seclar && arr[i]!=lar){
                seclar = arr[i];
            }
        }
        System.out.println(seclar);

    }

    static void isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]>arr[i]){
                System.out.println("Not sorted");
                return;
            }
        }
        System.out.println("sorted");
    }
    static void reverse(int[] arr){
        int l =0;
        int r = arr.length-1;
       while(l<r){
           int temp = arr[l];
           arr[l]= arr[r];
           arr[r]=temp;
           l++;
           r--;
       }
        System.out.println(Arrays.toString(arr));
    }

    static void diff(int[] arr){
      int diff= Math.abs(arr[0]- arr[arr.length-1]);
        System.out.println(diff);
    }

    static void deleteSmallest(int[] arr){
        // 2 5 1 6 7 9
        int s = arr[0]; int idex=0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if(s>arr[i]){
                s= arr[i];
                idex = i;
            }
        }
        for (int i = idex+1; i < size ; i++) {
            arr[i-1]=arr[i];
        }
        size--;
        System.out.println(Arrays.toString(arr));
    }
}


