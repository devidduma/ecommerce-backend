package com.ecommerce.dto;

import com.ecommerce.entities.Address;
import com.ecommerce.entities.Customer;
import com.ecommerce.entities.Order;
import com.ecommerce.entities.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
