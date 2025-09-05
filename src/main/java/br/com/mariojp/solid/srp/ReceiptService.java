package br.com.mariojp.solid.srp;

public class ReceiptService {
	public String generate(Order order) {
		ReceiptFormatter receipt = new ReceiptFormatter();
		TaxCalculator calc = new TaxCalculator(Double.parseDouble(System.getProperty("tax.rate")));
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		double calculatedTax = calc.calculate(subtotal); //Taxa 10 fixa :(
		double total = subtotal + calculatedTax;

		StringBuilder sb = new StringBuilder(); //Formatando o Recibo
		for (var i : order.getItems()) {
			sb.append(i.getName()).append(" x").append(i.getQuantity()).append(" = ").append(i.getUnitPrice() * i.getQuantity())
					.append("\n");
		}
		return receipt.returnReceipt(sb.toString(), subtotal, calc.getTaxValue(), total);
	}
}
