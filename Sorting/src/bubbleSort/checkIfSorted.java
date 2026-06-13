package bubbleSort;

public class checkIfSorted {
    public static void isSorted(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                return;

            }
        }
            System.out.println("sorted");
    }
    public static void main(String[] args) {
        int[] arr ={1,3,7,9};
        isSorted(arr);
    }

}
