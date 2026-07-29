public class Reversechar {
    public static void main(String[] args) {
        String s="hello world";
       String[] arr=s.split(" ");
       String temp="";
       for(String val:arr){
           temp=temp+rev(val+" ");
       }
        System.out.println(temp);
    }
    public static String rev(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
}
