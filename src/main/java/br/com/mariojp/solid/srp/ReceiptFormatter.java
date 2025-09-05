package br.com.mariojp.solid.srp;

public class ReceiptFormatter {
    StringBuilder sb = new StringBuilder(); //Formatando o Recibo

        public String returnReceipt (String listaDeItens, double subtotal, double tax, double total) {
            sb.append("=== RECIBO ===\n");
            sb.append("lista de Itens: \n").append(listaDeItens).append("\n");
            sb.append("Subtotal: ").append(subtotal).append("\n");
            sb.append("Tax: ").append(tax).append("\n");
            sb.append("Total: ").append(total).append("\n");
            return sb.toString();
    }
}


