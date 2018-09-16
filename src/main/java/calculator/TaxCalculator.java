package calculator;

import companies.Company;
import companies.Turnover;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculator {

    public BigDecimal calculateTaxes(Company company, Turnover companyTurnover) {
        final BigDecimal turnover = companyTurnover.getValue();
        final BigDecimal companyTaxRate = company.getTaxRate();
        final BigDecimal taxValue = turnover.multiply(companyTaxRate);
        return taxValue.setScale(2, RoundingMode.CEILING);
    }
}