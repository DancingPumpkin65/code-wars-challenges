import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberFormatting {
    public static String formatValue(String data) {
        // Handle null input :0
        if (data == null) {
            return "0.00";
        }

        try {
            // Convert to BigDecimal and set scale with rounding half up -=-
            BigDecimal number = new BigDecimal(data).setScale(2, RoundingMode.HALF_UP);
            return number.toString();
        } catch (NumberFormatException e) {
            // Handle invalid input gracefully :)
            return "0.00";
        }
    }
}