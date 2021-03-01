package com.example.orders.controllers;

import com.example.orders.exception.UserFoundException;
import com.example.orders.model.Order;
import com.example.orders.model.Product;
import com.example.orders.service.OrderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

@RestController
public class OrderController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OrderRespository orderRespository;

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

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmb28iLCJleHAiOjE2MTQ4ODg5NjUsImlhdCI6MTYxNDYzMzg2Nn0.N-H8e_e-ZUYW46lceOONnmK8wlgAESIp7berwuxRwdQ");
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> requestEntity = new HttpEntity<>(headers);


       try {
           ResponseEntity<String> result = restTemplate.exchange("http://localhost:8080/products", HttpMethod.GET, requestEntity, String.class);
           logger.info("returned data:", result.getBody());

           if (result.getStatusCode() == HttpStatus.OK) {
               System.out.println("response received");
               System.out.println(result.getBody());
           } else {
               System.out.println("error occurred");
               System.out.println(result.getStatusCode());
           }
       } catch (HttpClientErrorException ex){
           logger.info("error:", ex);
       }

        Order newOrder = orderRespository.save(order);

        return newOrder;


    }


}
