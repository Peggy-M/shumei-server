package com.peppa.springweb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceInfo {
    private int priceType;
    private String price;

    // Getters and Setters
}