package com.acme.ecom.order.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ecom_order_view")
@Data
@EqualsAndHashCode(exclude = { "id" })
public class ProductView {
    @Id
    private  Integer id;

    private  Double price;

    private  Integer stock;

    private  String description;


    public ProductView(Integer id, Double price, Integer stock, String description) {

        super();
        this.id = id;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }
}
