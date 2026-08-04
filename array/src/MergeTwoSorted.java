import java.util.Arrays;

public class MergeTwoSorted {
    public static void main(String[] args) {
        int[] a = {1, 3, 7, 9};
        int[] b = {2, 5, 8};

        merge(a,b);
    }
    static void merge(int[] a,int[] b){

        int[] merge = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                merge[k] = a[i];
                i++;
            } else {
                merge[k] = b[j];
                j++;
            }
            k++;
        }
        while (i<a.length){
            merge[k]=a[i];
            i++;
        }
        while (j<b.length){
            merge[k]=b[j];
            j++;
        }
        System.out.println(Arrays.toString(merge));
    }
}