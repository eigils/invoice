package com.mycompany.invoice.core.repository.memory;

import com.mycompany.invoice.core.entity.Invoice;
import com.mycompany.invoice.core.repository.InvoiceRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {

    private static List<Invoice> invoices = new ArrayList<Invoice>();

    public void create(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Memory : Invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }

    @Override
    public Invoice getById(String number) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Invoice> list() {
        throw new UnsupportedOperationException();
    }
}
