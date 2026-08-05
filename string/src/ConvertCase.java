import java.util.Scanner;

public class ConvertCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.charAt(0)>97){
            System.out.println(s.toLowerCase());
        }else{
            System.out.println(s.toUpperCase());
        }
    }
}
