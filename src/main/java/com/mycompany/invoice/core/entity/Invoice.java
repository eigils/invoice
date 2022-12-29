package com.mycompany.invoice.core.entity;

//import org.springframework.data.annotation.Id;

//import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.*;

@Entity
public class Invoice {
    //@Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column("INVOICE_NUMBER") notation Jdbc
    @Column(name="INVOICE_NUMBER")
    private String number;
    private String customerName;
    private String orderNumber;

    public Invoice(String number, String customerName) {
        this.number = number;
        this.customerName = customerName;
    }

    public Invoice(String number, String customerName, String orderNumber) {
        this.number = number;
        this.customerName = customerName;
        this.orderNumber = orderNumber;
    }

    public Invoice() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
