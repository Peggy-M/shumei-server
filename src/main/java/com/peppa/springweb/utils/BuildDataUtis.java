package com.peppa.springweb.utils;


import com.peppa.springweb.dto.TitleList;

import java.util.ArrayList;
import java.util.List;

public class BuildDataUtis {
    private static List<TitleList> tabs;

    public BuildDataUtis() {
        tabs = new ArrayList<>();
        tabs.add(new TitleList("精选推荐", 0));
        tabs.add(new TitleList("夏日防晒", 1));
        tabs.add(new TitleList("二胎大作战", 2));
        tabs.add(new TitleList("人气榜", 3));
        tabs.add(new TitleList("好评榜", 4));
        tabs.add(new TitleList("RTX 30", 5));
        tabs.add(new TitleList("手机也疯狂", 6));
    }

    public static List<TitleList> getTabs() {
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
        return urls;
    }

}