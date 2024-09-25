package com.peppa.springweb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockInfo {
    private int stockQuantity;
    private int safeStockQuantity;
    private int soldQuantity;

    // Getters and Setters
}