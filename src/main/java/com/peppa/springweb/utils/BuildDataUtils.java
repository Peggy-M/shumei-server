package com.peppa.springweb.utils;


import cn.hutool.json.JSONUtil;
import com.peppa.springweb.dto.*;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BuildDataUtils {

    public static List<TitleList> getTitleList() {
        List<TitleList> tabs = new ArrayList<>();
        tabs.add(new TitleList("舒美内衣", 0));
        tabs.add(new TitleList("炎炎夏日", 1));
        tabs.add(new TitleList("美丽动人", 2));
        tabs.add(new TitleList("销量王", 3));
        tabs.add(new TitleList("夺冠榜", 4));
        tabs.add(new TitleList("RTX 30", 5));
        tabs.add(new TitleList("手机也疯狂", 6));
        String jsonStr = JSONUtil.toJsonStr(tabs);
        System.out.println(jsonStr);
        return tabs;
    }

    public static List<String> getBannerImages() {
        List<String> urls = new ArrayList<>();
        urls.add("https://peppa-obsidian.oss-cn-beijing.aliyuncs.com/Snipaste_2024-05-23_22-25-09.jpg");
        urls.add("https://peppa-obsidian.oss-cn-beijing.aliyuncs.com/Snipaste_2024-06-11_11-53-53.png");
        urls.add("https://peppa-obsidian.oss-cn-beijing.aliyuncs.com/Snipaste_2024-06-11_11-54-11.png");
        urls.add("https://peppa-obsidian.oss-cn-beijing.aliyuncs.com/Snipaste_2024-06-11_11-54-20.png");
        urls.add("https://cdn-we-retail.ym.tencent.com/tsr/home/v2/banner5.png");
        urls.add("https://cdn-we-retail.ym.tencent.com/tsr/home/v2/banner6.png");
        String jsonStr = JSONUtil.toJsonStr(urls);
        System.out.println(jsonStr);
        return urls;
    }

    public static List<Product> getProductList() {
        List<Product> products = new ArrayList<>();
        // 白色短袖连衣裙
        Product dress = new Product();
        dress.setSaasId("88888888");
        dress.setStoreId("1000");
        dress.setSpuId("0");
        dress.setTitle("白色短袖连衣裙荷叶边裙摆宽松韩版休闲纯白清爽优雅连衣裙");
        dress.setPrimaryImage("https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-09a.png");
        dress.setImages(Arrays.asList(
                "https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-09a.png",
                "https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-09b.png"
        ));
        dress.setAvailable(1);
        dress.setMinSalePrice(29800);
        dress.setMaxSalePrice(29800);
        dress.setSpuStockQuantity(510);
        dress.setSoldNum(1020);
        dress.setIsPutOnSale(1);
        dress.setCategoryIds(Arrays.asList("127880527393854975", "127880527393854976", "127880537778953984"));

        Spec colorSpec = new Spec();
        colorSpec.setSpecId("10011");
        colorSpec.setTitle("颜色");
        colorSpec.setSpecValueList(Collections.singletonList(new SpecValue("10012", "米色荷叶边")));

        Spec sizeSpec = new Spec();
        sizeSpec.setSpecId("10013");
        sizeSpec.setTitle("尺码");
        sizeSpec.setSpecValueList(Arrays.asList(
                new SpecValue("11014", "S"),
                new SpecValue("10014", "M"),
                new SpecValue("11013", "L")
        ));

        dress.setSpecList(Arrays.asList(colorSpec, sizeSpec));

        Sku sku = new Sku();
        sku.setSkuId("135676631");
        sku.setSkuImage("https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-09a.png");
        sku.setSpecInfo(Arrays.asList(
                new SpecInfo("10011", "10012"),
                new SpecInfo("10013", "11014")
        ));
        sku.setPriceInfo(Arrays.asList(new PriceInfo(1, "29800"), new PriceInfo(2, "40000")));
        StockInfo stockInfo = new StockInfo();
        stockInfo.setStockQuantity(175);
        sku.setStockInfo(stockInfo);

        dress.setSkuList(Collections.singletonList(sku));

        // 标签设置
        Tag tag = new Tag();
        tag.setId("13001");
        tag.setTitle("限时抢购");
        dress.setSpuTagList(Collections.singletonList(tag));

        // 限制信息设置
        LimitInfo limitInfo = new LimitInfo();
        limitInfo.setText("限购5件");
        dress.setLimitInfo(Collections.singletonList(limitInfo));

        // 描述设置
        dress.setDesc(Arrays.asList(
                "https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-09c.png",
                "https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-09d.png"
        ));
        dress.setEtitle("");

        products.add(dress);

        // 运动连帽拉链卫衣
        Product hoodie = new Product();
        hoodie.setSaasId("88888888");
        hoodie.setStoreId("1000");
        hoodie.setSpuId("135691628");
        hoodie.setTitle("运动连帽拉链卫衣休闲开衫长袖多色运动细绒面料运动上衣");
        hoodie.setPrimaryImage("https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-17a.png");
        hoodie.setMinSalePrice(25900);
        hoodie.setMaxSalePrice(25900);
        hoodie.setSpuStockQuantity(0);
        hoodie.setSoldNum(1022);
        hoodie.setIsPutOnSale(1);

        Spec colorSpecHoodie = new Spec();
        colorSpecHoodie.setSpecId("127904180600844800");
        colorSpecHoodie.setTitle("颜色");
        colorSpecHoodie.setSpecValueList(Collections.singletonList(new SpecValue("127904180768617216", "军绿色")));

        Spec sizeSpecHoodie = new Spec();
        sizeSpecHoodie.setSpecId("127904861604820480");
        sizeSpecHoodie.setTitle("尺码");
        sizeSpecHoodie.setSpecValueList(Arrays.asList(
                new SpecValue("127904862494014208", "XS"),
                new SpecValue("127904862175246592", "S"),
                new SpecValue("127904862007474176", "M"),
                new SpecValue("127904861755815680", "L")
        ));

        hoodie.setSpecList(Arrays.asList(colorSpecHoodie, sizeSpecHoodie));

        // 添加到产品列表
        products.add(hoodie);

        // 纯色纯棉T恤
        Product tShirt = new Product();
        tShirt.setSaasId("88888888");
        tShirt.setStoreId("1000");
        tShirt.setSpuId("135686633");
        tShirt.setTitle("纯色纯棉休闲圆领短袖T恤纯白亲肤厚柔软细腻面料纯白短袖套头T恤");
        tShirt.setPrimaryImage("https://cdn-we-retail.ym.tencent.com/tsr/goods/nz-08b.png");
        tShirt.setMinSalePrice(25900);
        tShirt.setMaxSalePrice(26900);
        tShirt.setSpuStockQuantity(371);
        tShirt.setSoldNum(1032);
        tShirt.setIsPutOnSale(1);

        Spec colorSpecTShirt = new Spec();
        colorSpecTShirt.setSpecId("10000");
        colorSpecTShirt.setTitle("颜色");
        colorSpecTShirt.setSpecValueList(Collections.singletonList(new SpecValue("10001", "白色")));

        Spec sizeSpecTShirt = new Spec();
        sizeSpecTShirt.setSpecId("10002");
        sizeSpecTShirt.setTitle("尺码");
        sizeSpecTShirt.setSpecValueList(Arrays.asList(
                new SpecValue("11003", "S"),
                new SpecValue("10003", "M"),
                new SpecValue("11002", "L")
        ));

        tShirt.setSpecList(Arrays.asList(colorSpecTShirt, sizeSpecTShirt));

        // 添加到产品列表
        products.add(tShirt);

        // 打印所有产品信息
        for (Product product : products) {
            System.out.println(product);
        }
        return products;
    }

}