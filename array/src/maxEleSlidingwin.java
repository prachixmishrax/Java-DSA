import java.util.Scanner;

public class maxEleSlidingwin {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] nums = {1,3,-1,-3,5,3,6,7};
            int k = 3;
            int n = nums.length;

            int[] arr = new int[n-k+1];
            int i=0,j=0 ,max=nums[i];
            while(j<nums.length){
                int t = j-i+1;
                if(max < nums[j]){
                    max=nums[j];
                }
                if(t==k){
                    arr[i]=max;
                    i++;
                    j++;
                } else if (t<k) {
                    j++;
                }
            }
            for (int l = 0; l < n-k+1; l++) {
                System.out.print(arr[l]+" ");
            }

        }

    }

