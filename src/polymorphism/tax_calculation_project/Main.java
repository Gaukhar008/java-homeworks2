import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        IncomeTaxType incomeTax = new IncomeTaxType();
        VATaxType vatTax = new VATaxType();
        ProgressiveTaxType progressiveTax = new ProgressiveTaxType();

        Bill[] payments = new Bill[] {
                new Bill(BigDecimal.valueOf(50000), incomeTax, taxService),
                new Bill(BigDecimal.valueOf(70000), vatTax, taxService),
                new Bill(BigDecimal.valueOf(100000), progressiveTax, taxService),
        };
        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
