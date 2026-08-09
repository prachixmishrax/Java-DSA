public class FindMaxInCol {
        public static void main(String[] args) {
            int[][] arr = {{1, 2, 3}, {10, 23, 44}, {20, 56, 8}};

            for (int i = 0; i < arr.length; i++) {
                int max = arr[0][0];
                for (int j = 0; j < arr[0].length; j++) {
                    if (max < arr[j][i]) {
                        max = arr[j][i];
                    }
                }
                System.out.println(max);
            }

        }
    }
