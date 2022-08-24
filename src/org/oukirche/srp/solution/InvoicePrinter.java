package org.oukirche.srp.solution;

import org.oukirche.srp.probleme.Invoice;

public class InvoicePrinter {
    private InvoiceSolution invoice;

    public InvoicePrinter(InvoiceSolution invoice) {
        this.invoice = invoice;
    }

    public void print() {
        System.out.println(invoice.getQuantity() + "x " + invoice.getBook().getName() + " " + invoice.getBook().getPrice() + " $");
        System.out.println("Discount Rate: " + invoice.getDiscountRate());
        System.out.println("Tax Rate: " + invoice.getTaxRate());
        System.out.println("Total: " + invoice.getTotal() + " $");
    }
}
