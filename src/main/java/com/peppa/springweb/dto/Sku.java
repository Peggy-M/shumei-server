package com.peppa.springweb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sku {
    private String skuId;
    private String skuImage;
    private List<SpecInfo> specInfo;
    private List<PriceInfo> priceInfo;
    private StockInfo stockInfo;
    private Weight weight;
    private Object volume;
    private Object profitPrice;

    // Getters and Setters
}