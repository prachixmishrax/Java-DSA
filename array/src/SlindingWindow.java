public class SlindingWindow {
    public static void main(String[] args) {
        int arr[]={1,-2,3,4,-6,-4,5,6};
        int n = 4;
        int max = Integer.MIN_VALUE;
//        window one
        int sum = 0;
        for(int i =0;i<n;i++){
            sum=sum+arr[i];
        }
        if(sum>max){
            max=sum;
        }
        System.out.println(sum);
//        Next element insert = N-LEN-1
        for(int i =0;i< arr.length;i++){
            sum=sum+arr[i]-arr[i-n];
            System.out.println();
        }

    }
}
