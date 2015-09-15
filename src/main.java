import sun.security.krb5.internal.crypto.Des;

/**
 * Created by mfreyre on 8/27/15.
 */
public class main {
    public static void main(String[] args) {
        QuickCalc quickCalc = new QuickCalc();
        quickCalc.choose(3, 2);
        System.out.println(quickCalc.choose(4, 1));
    }
}
