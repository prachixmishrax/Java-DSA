public class FreqCount {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,4,3,6,0};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int[] arr1 = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            arr1[arr[i]]++;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>0)
            System.out.println(i +" : "+arr1[i]);
        }

    }
}
