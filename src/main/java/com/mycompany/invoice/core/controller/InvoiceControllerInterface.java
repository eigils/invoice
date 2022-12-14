package com.mycompany.invoice.core.controller;

import com.mycompany.invoice.core.entity.Invoice;
import com.mycompany.invoice.core.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    Invoice createInvoice(Invoice invoice);

    void setInvoiceService(InvoiceServiceInterface invoiceService);

}
