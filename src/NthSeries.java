/**
 * Created by mfreyre on 8/27/15.
 */
public class NthSeries {
    public static String seriesSum(int n) {
        double denominator = 1;
        double sum = 0;
        for(int i= 1; i<=n; i++){
            sum+= ((double)1)/denominator;
            denominator += 3;
        }
String sumString = String.format("%.3g%n", sum);
    return sumString.replaceAll("\\s+","");
    }
}
