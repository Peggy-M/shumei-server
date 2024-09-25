package com.peppa.springweb.controller;

import cn.hutool.json.JSONUtil;
import com.peppa.springweb.dto.Product;
import com.peppa.springweb.dto.TitleList;
import com.peppa.springweb.utils.BuildDataUtils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: peppa
 * @Description: DOTO
 * @Date: Created in 8:25 2024/9/25
 */
@RestController
@RequestMapping("/shumei")
public class webController {

    @GetMapping("/getBannerImages")
    public  List<String> getBannerImages() {
        return BuildDataUtils.getBannerImages();
    }

    @GetMapping("/getTabList")
    public List<TitleList> getTabList() {
        return BuildDataUtils.getTitleList();
    }

    @GetMapping("/getProductList")
    public List<Product>  getProductList(){
        return BuildDataUtils.getProductList();
    }
}
