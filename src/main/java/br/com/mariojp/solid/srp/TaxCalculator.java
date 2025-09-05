package br.com.mariojp.solid.srp;

public class TaxCalculator {
    private double taxValue;

    public TaxCalculator(double taxValue) {
        this.taxValue = taxValue;
    }

    public double calculate(double subtotal) {
        return taxValue * subtotal;
    }

    public double getTaxValue() {
        return taxValue;
    }
}
