
public class ReverseString {
        public static String reverseString(String s) {
            // code here
            StringBuilder str = new StringBuilder();
            int i = s.length()-1;
            while(i>=0){
                str.append(s.charAt(i));
                i--;
            }
            return str.toString();

        }
    public static void main(String[] args) {
      String s = "Hello";
        System.out.println();
        System.out.println(reverseString(s));
    }
}