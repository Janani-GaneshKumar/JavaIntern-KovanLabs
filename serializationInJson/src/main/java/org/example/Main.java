package org.example;


import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        Product laptop = new Product("MacBook Pro", 2499.9, "HIDDEN-123");

        try {
            // Serialization
            String jsonOutput = mapper.writeValueAsString(laptop);
            System.out.println("Serialized JSON: " + jsonOutput);

            // Deserialization
            String inputJson = "{\"product_name\":\"iPhone\",\"price\":999.00}";
            Product phone = mapper.readValue(inputJson, Product.class);
            System.out.println("Deserialized Name: " + phone.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
