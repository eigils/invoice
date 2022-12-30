package com.mycompany.invoice.core.service.number;

import com.mycompany.invoice.core.entity.Customer;
import com.mycompany.invoice.core.entity.Invoice;
import com.mycompany.invoice.core.repository.CustomerRepositoryInterface;
import com.mycompany.invoice.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    //private static long lastNumber=0L;

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    @Autowired
    private CustomerRepositoryInterface customerRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Transactional
    public Invoice createInvoice(Invoice invoice) {
        //invoice.setNumber(String.valueOf(++lastNumber));
        customerRepository.save(invoice.getCustomer());
        return invoiceRepository.save(invoice);
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        return invoiceRepository.findById(number).orElseThrow();
    }

    @Override
    public Iterable<Invoice> getInvoiceList() {
        //Iterable<Invoice> invoices = invoiceRepository.findAll();
        //Ceci permet d'initialiser le client de chaque facture
        //invoices.forEach(invoice -> invoice.getCustomer().getName());
        return invoiceRepository.findAll();
    }
}
