package org.oukirche.srp.solution;

import org.oukirche.srp.probleme.Invoice;

public class InvoicePersistence {

    InvoiceSolution invoice;

    public InvoicePersistence(InvoiceSolution invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }
}
