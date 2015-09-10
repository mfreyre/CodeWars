/**
 * Created by mfreyre on 8/28/15.
 */

public class Circle {
    public static double area(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Error!");
        } else {

            return Math.PI * radius * radius;
        }


    }


}
