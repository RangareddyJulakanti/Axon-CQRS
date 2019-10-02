package com.acme.ecom.order.model;

import com.acme.ecom.product.model.Product;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name="ecom_product_view")
@Data
@EqualsAndHashCode(exclude = { "id" })
public class OrderView {

    private static final long serialVersionUID = 12L;

    @Id
    private Integer id;

    @Column(name="PRICE")
    private Double price;

    @Column(name="NUMBER")
    private Integer number;

    @Column(name="ORDER_STATUS")
    @Enumerated(EnumType.STRING)
    private OrderStatusEnum orderStatus; ;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PRODUCT_ID")
    private Product product;



    public OrderView() {
    }
}
