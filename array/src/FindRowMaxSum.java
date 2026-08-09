public class FindRowMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{10,23,44},{20,56,8}};
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = 0; j < arr[0].length; j++) {
                sum+=arr[i][j];

            }
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(max);

    }
}
