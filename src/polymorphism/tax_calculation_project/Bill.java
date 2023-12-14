import java.math.BigDecimal;
import java.nio.Buffer;

public class Bill {
    private BigDecimal amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(BigDecimal amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        BigDecimal taxAmount = this.taxType.calculateTaxFor(this.amount);

        taxService.payOut(taxAmount);
    }
}
