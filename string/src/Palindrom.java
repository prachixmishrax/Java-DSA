public class Palindrom {
    public static void main(String[] args) {
        String str = "kanak";
        int i =0;
        int j = str.length()-1;
        boolean isPal = true;
        while(i<=j){
            if (str.charAt(i)!=str.charAt(j)){
               isPal=false;
            }
            i++;
            j--;

        }
if(isPal){
    System.out.println("panlindrome");

}else {
    System.out.println(" not panlindrome");

}
    }
}
