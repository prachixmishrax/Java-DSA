//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,8};
//        int target = 7;
//        linearSearch(arr,6,0);
//        System.out.println(linearSearch(arr,76,0));
        System.out.println(linearSearch2(arr,8,0));
    }
    static boolean linearSearch(int[] arr,int target,int i){
        if(i == arr.length){
            return false;
        }
        return arr[i] == target || linearSearch(arr,target,i+1);
    }
    static int linearSearch2(int[] arr,int target,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==target) {
            return i;
        }else {
           return linearSearch2(arr, target, i + 1);
        }
    }
}