import java.util.Scanner;

public class ValidPalindrome {
        public static boolean isPalindrome(String s) {
            String str = s.replaceAll("[^a-zA-Z0-9]+","");
            str = str.toLowerCase();
            // int n = str.length();
            int i = 0;
            int j = str.length()-1;
            while(i<j){
                if( str.charAt(i) == str.charAt(j)){
                    i++;
                    j--;
                }else return false;
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
    }

