//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int rev(int n,int rev) {
        if (n == 0)
            return;

        return rev(n / 10,rev * 10 + n % 10);
//
    }

    public static void main(String[] args) {
        int rev=rev(12341,0);
        System.out.println(rev);
    }
}