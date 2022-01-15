import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) throws Exception {
    }

    public static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values)
            if (v > largest)
                largest = v;
        return largest;
    }
}
