package com.peppa.springweb.controller;

import com.peppa.springweb.dto.TitleList;
import com.peppa.springweb.utils.BuildDataUtis;
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
    public List<String> getBannerImages() {
        return BuildDataUtis.getBannerImages();
    }

    @GetMapping("/getTabList")
    public List<TitleList> getTabList() {
        return BuildDataUtis.getTabs();
    }

}
