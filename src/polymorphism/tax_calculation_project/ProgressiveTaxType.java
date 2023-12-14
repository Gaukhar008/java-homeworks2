import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal tax = new BigDecimal(0);
        if (amount.compareTo(BigDecimal.ZERO) > 0 && amount.compareTo(BigDecimal.valueOf(100000)) < 0) {
            tax = amount.multiply(new BigDecimal("0.1"));
        } else if (amount.compareTo(BigDecimal.valueOf(100000)) >= 0) {
            tax = amount.multiply(new BigDecimal("0.15"));
        }
        return tax;
    }
}
