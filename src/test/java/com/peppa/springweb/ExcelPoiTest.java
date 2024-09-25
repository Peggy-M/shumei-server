package com.peppa.springweb;

import com.peppa.springweb.utils.ExcelUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: P636516
 * @date: 2024/8/20 14:29
 * @description:
 * @version:1.0
 */
public class ExcelPoiTest {
    public static void main(String[] args) {
        List<List<String>> objData = new ArrayList<>();
        // 添加表头
        objData.add(Arrays.asList("ID", "Name", "Category", "Quantity", "Price", "Supplier"));
        // 添加数据行
        objData.add(Arrays.asList("1", "Laptop", "Electronicsssssssssssssss", "10000000000000000", "800", "Supplier A"));
        objData.add(Arrays.asList("2", "Smartphone", "ElectronicsElectronicsssssssssssssss", "50", "500", "Supplier B"));
        objData.add(Arrays.asList("3", "Desk Chair", "Furniture", "20", "120", "Supplier C"));
        objData.add(Arrays.asList("4", "Notebook", "Stationery", "100", "3", "Supplier D"));
        objData.add(Arrays.asList("5", "Pen", "Stationery", "200", "1", "Supplier E"));
        try {
            ExcelUtil.createExcel(objData, "D:/test.xlsx");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
