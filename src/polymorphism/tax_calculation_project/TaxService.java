import java.math.BigDecimal;

public class TaxService {
    public void payOut(BigDecimal taxAmount) {
        System.out.format("Taxes are paid in the amount of %.2f%n", taxAmount);
    }
}
