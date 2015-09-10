/**
 * Created by mfreyre on 8/29/15.
 */
public class ReverseLonger {
    public ReverseLonger() {
    }

    public static String shorterReverseLonger(String a, String b) {
        if(a.length()<b.length()){return a+ reverse(b)+a;}
        else{return b+reverse(a)+b;}
    }

    private static String reverse(String toReverse) {
        String reversed = new StringBuilder(toReverse).reverse().toString();


        return reversed;
    }


}
