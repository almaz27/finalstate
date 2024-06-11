package com.example.demo.controllers.payloads;

public record NewProductPayload(
        String name,
        String description,
        double price) {

}
