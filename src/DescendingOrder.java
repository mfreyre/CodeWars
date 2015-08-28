import java.util.Arrays;

/**
 * Created by mfreyre on 8/27/15.
 */
public class DescendingOrder {

    public static int sortDesc(final int num) {
        if (num >= 0 && num < 10) {
            return num;
        }
        String stringNum = String.valueOf(num);
        char[] arrayNum = stringNum.replaceAll("\\W", "").toCharArray();

        String sortedStringNum = "";
        Arrays.sort(arrayNum);

        for (int i = arrayNum.length -1; i >=0; i--) {
            System.out.println(arrayNum[i]);
            sortedStringNum += arrayNum[i];
        }


        return Integer.parseInt(sortedStringNum);
    }


}
