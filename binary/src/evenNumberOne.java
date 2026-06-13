public class evenNumberOne  {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            int num = i;
            int count=0;
            String ans = " ";
            while (num != 0) {
                int rem = num % 2;
                if(rem ==1){
                    count++;
                }
                num = num / 2;
                ans = rem + ans;

            }
            if(count%2==0){
            System.out.println(i + " = " +ans);}
        }
    }
}


