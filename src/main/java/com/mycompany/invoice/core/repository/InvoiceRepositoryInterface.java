package com.mycompany.invoice.core.repository;

import com.mycompany.invoice.core.entity.Invoice;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InvoiceRepositoryInterface extends CrudRepository<Invoice,String> {

   /* Invoice create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);*/
}
