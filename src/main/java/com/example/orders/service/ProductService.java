package com.example.orders.service;

import com.example.orders.model.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ProductService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public Product[] getProducts() {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmb28iLCJleHAiOjE2MTQ4ODg5NjUsImlhdCI6MTYxNDYzMzg2Nn0.N-H8e_e-ZUYW46lceOONnmK8wlgAESIp7berwuxRwdQ");
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> requestEntity = new HttpEntity<>(headers);

        ObjectMapper mapper = new ObjectMapper();

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

            Product[] productList = mapper.readValue(result.getBody(), Product[].class);

            return productList;

        } catch (HttpClientErrorException ex){
            logger.info("error:", ex);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;

    }
}
