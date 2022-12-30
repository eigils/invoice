package com.mycompany.invoice.core.repository;

import com.mycompany.invoice.core.entity.Invoice;
//import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InvoiceRepositoryInterface extends CrudRepository<Invoice,String> {

    //@Query("SELECT invoice from Invoice invoice inner join fetch invoice.customer")
    @EntityGraph(value = "invoice.customer",type = EntityGraph.EntityGraphType.FETCH)
    Iterable<Invoice> findAll();

   /* Invoice create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);*/
}
