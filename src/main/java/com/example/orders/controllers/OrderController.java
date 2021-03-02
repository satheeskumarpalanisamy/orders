package com.example.orders.controllers;

import com.example.orders.exception.UserFoundException;
import com.example.orders.model.Order;
import com.example.orders.model.Product;
import com.example.orders.service.OrderRespository;
import com.example.orders.service.ProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OrderRespository orderRespository;

    @Autowired
    private ProductService postService;

    @GetMapping("/orders/{orderNumber}")
    public Optional<Order> geOrderDetails(@PathVariable int orderNumber) {
        return orderRespository.findById(orderNumber);
    }

    @PostMapping("/create/orders")
    public Order createOrder(@RequestBody Order order) throws URISyntaxException {

        Optional<Order> optionalOrder = orderRespository.findById(order.getOrderId());

        if (optionalOrder.isPresent()) {
            throw new UserFoundException("Order ID:"+ order.getOrderId());
        }

        Product[] productList = postService.getProducts();

        System.out.println("JSON array to Array objects...");
        for (Product indiProduct : productList) {
            System.out.println(indiProduct);
            if (indiProduct.getProductId() == order.getItem1productId()) {
                if (indiProduct.getQuantity() == 0) {
                   order.setItem1Status("Stock not available");
                } else {
                    order.setItem1Status("Confirmed");
                }
            }
            if (indiProduct.getProductId() == order.getItem2productId()) {
                if (indiProduct.getQuantity() == 0) {
                    order.setItem2Status("Stock not available");
                } else {
                    order.setItem2Status("Confimed");
                }
            }
        }

        Order newOrder = orderRespository.save(order);

        return newOrder;


    }


}
