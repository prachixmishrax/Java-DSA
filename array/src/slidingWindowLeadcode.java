import java.util.Scanner;

public class slidingWindowLeadcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int n = nums.length;
        int k = sc.nextInt();
        int[] arr = new int[n-k+1];
        int i=0,j=0,sum=0;
        while(j<nums.length){
            int t = j-i+1;
            sum+=nums[j];
            if(t==k){
             arr[i]=sum;
             sum-=nums[i];
             i++;
             j++;
            } else if (t<k) {
               j++;
            }
        }
        for (int l = 0; l < n-k+1; l++) {
            System.out.println(arr[l]+" ");
        }

    }

}
