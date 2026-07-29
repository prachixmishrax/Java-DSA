public class LeaderOpt {
    public static void main(String[] args) {
        int[] arr = {1,3,7,2,8,9};
        int max = arr[arr.length-1];
        System.out.println(max);
        for (int i = arr.length-2; i >= 0; i--) {
            if(max<arr[i]){
                System.out.println(arr[i]);
                max=arr[i];
            }
        }
    }
}
