package com.mycompany.invoice.core.repository.database;

import com.mycompany.invoice.core.entity.Invoice;
import com.mycompany.invoice.core.repository.InvoiceRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static List<Invoice> invoices = new ArrayList<Invoice>();


    public Invoice create(Invoice invoice) {
        /*invoices.add(invoice);
        System.out.println("Database : Invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());*/
        /* PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO FACTURE (NUMBER,DESCRIPTION) VALUES (?,?");
        preparedStatement.executeUpdate();*/
        /*return invoice;*/

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO INVOICE(CUSTOMER_NAME,ORDER_NUMBER) VALUES (?,?)",
                    Statement.RETURN_GENERATED_KEYS);
                     preparedStatement.setString(1,invoice.getCustomerName());
                     preparedStatement.setString(2,invoice.getOrderNumber());
            return preparedStatement;
        },keyHolder);

        invoice.setNumber(keyHolder.getKey().toString());
        return invoice;
    }

    @Override
    public List<Invoice> list() {
       /* Invoice invoice1 = new Invoice();
        invoice1.setNumber("NUM_1");
        invoice1.setCustomerName("EDF");
        Invoice invoice2 = new Invoice();
        invoice2.setNumber("NUM_2");
        invoice2.setCustomerName("La Poste");
        return List.of(invoice1,invoice2);*/

        return jdbcTemplate.query("SELECT INVOICE_NUMBER,CUSTOMER_NAME FROM INVOICE",
                (rs,rowNum) -> new Invoice(String.valueOf(rs.getLong("INVOICE_NUMBER")),
                        rs.getString("CUSTOMER_NAME")));
    }

    @Override
    public Invoice getById(String number) {
        /*Invoice invoice = new Invoice();
        invoice.setNumber(number);
        invoice.setCustomerName("Skate");
        invoice.setOrderNumber("ON_002");
        return invoice;*/

        return jdbcTemplate.queryForObject("SELECT INVOICE_NUMBER,CUSTOMER_NAME,ORDER_NUMBER FROM INVOICE WHERE INVOICE_NUMBER=?",
                new Object[]{number},
                (rs,rowNum) -> new Invoice(String.valueOf(rs.getLong("INVOICE_NUMBER")),
                        rs.getString("CUSTOMER_NAME"),rs.getString("ORDER_NUMBER"))
        );
    }


}
