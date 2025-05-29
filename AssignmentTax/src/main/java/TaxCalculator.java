import javafx.application.Application;
import javafx.stage.Stage;

public class TaxCalculator {
    public static double calculateTax(double income, double deduction) {
        double taxable = income - deduction;
        double rate = 0.15;
        double tax = taxable * rate;

        if (tax < 0) {
            return 0;
        }

        return tax;
    }
}
