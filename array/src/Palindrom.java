public class Palindrom {

        public static void main(String[] args) {
            int n=121;
            System.out.println(isPalindrome(n));
        }
        public static boolean isPalindrome(int x) {
            if(x<0)return false;
            int reverse = 0;
            int temp=x;
            boolean isPalindrom=true;
            while (temp != 0) {
                reverse = (reverse * 10) + (temp % 10);
                temp/=10;
            }
            if(x!=reverse)isPalindrom=false;
            return isPalindrom;
        }
    }

