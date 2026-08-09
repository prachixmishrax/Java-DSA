public class FindMaxIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{10,23,44},{20,56,8}};
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
