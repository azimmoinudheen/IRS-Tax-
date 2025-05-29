public class TaxReturn {
    private double income;
    private double deduction;
    private double taxAmount;

    public TaxReturn(double income, double deduction) {
        this.income = income;
        this.deduction = deduction;
        computeTax();
    }

    public void computeTax() {
        taxAmount = TaxCalculator.calculateTax(income, deduction);
    }

    public double getTaxAmount() {
        return taxAmount;
    }
}
