public class Leader {
    public static void main(String[] args) {
        int[] arr = {1,5,8,4,9,3};
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i+1; j < arr.length ; j++) {

                if(arr[i]<arr[j]){
                    leader=false;
                    break;
                }

            }
            if(leader){
                System.out.println(arr[i]);
            }
        }
    }
}
