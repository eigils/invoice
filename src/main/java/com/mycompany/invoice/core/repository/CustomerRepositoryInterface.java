package com.mycompany.invoice.core.repository;

import com.mycompany.invoice.core.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoryInterface extends CrudRepository<Customer,Long> {

    //@Query("SELECT invoice from Invoice invoice inner join fetch invoice.customer")

   /* Invoice create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);*/
}
