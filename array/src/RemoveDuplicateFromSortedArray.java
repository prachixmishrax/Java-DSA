import java.util.ArrayList;

public class RemoveDuplicateFromSortedArray {
    static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> List = new ArrayList<>();
        int i = 0, j = 1;
        List.add(arr[i]);
        while (j<arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                List.add(arr[j]);
                i = j;
                j++;
            }

        }

        return List;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    }


