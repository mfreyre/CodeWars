import sun.security.util.BigInt;

import java.math.BigInteger;

public class QuickCalc {
    public static BigInteger choose(int n, int p) {
        if (n < p) {
            return new BigInteger("0");
        } else {
            BigInteger top = BigInteger.valueOf(n);
            BigInteger bottom = BigInteger.valueOf(p);
            BigInteger numerator = BigInteger.ONE;
            BigInteger current = top;
            BigInteger decrement = BigInteger.valueOf(-1);
            while(current.compareTo(bottom)>0){
                numerator = numerator.multiply(current);
                current=current.add(decrement);
            }
            System.out.println("out of while loop, baby!");
            System.out.println("numerator "+numerator);
            BigInteger denominator = BigInteger.ONE;
            top = top.subtract(bottom);

            System.out.println(top);

            current = BigInteger.ONE;
            while(current.compareTo(top)<=0){
                denominator = denominator.multiply(current);
                current=current.add(BigInteger.ONE);

            }
            System.out.println("denominator "+denominator);
            return numerator.divide(denominator);
        }


    }
}
