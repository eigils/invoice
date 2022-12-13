package com.mycompany.invoice.core.service.number;

import com.mycompany.invoice.core.entity.Invoice;
import com.mycompany.invoice.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.core.service.InvoiceServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    private static long lastNumber=0L;

    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepository.getById(number);
    }

    @Override
    public List<Invoice> getInvoiceList() {
        return invoiceRepository.list();
    }
}
