package com.peppa.springweb.dto;

import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String saasId;
    private String storeId;
    private String spuId;
    private String title;
    private String primaryImage;
    private List<String> images;
    private String video;
    private int available;
    private int minSalePrice;
    private int minLinePrice;
    private int maxSalePrice;
    private int maxLinePrice;
    private int spuStockQuantity;
    private int soldNum;
    private int isPutOnSale;
    private List<String> categoryIds;
    private List<Spec> specList;
    private List<Sku> skuList;
    private List<Tag> spuTagList;
    private List<LimitInfo> limitInfo;
    private List<String> desc;
    private String etitle;

    // Getters and Setters
}