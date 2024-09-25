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
public class Spec {
    private String specId;
    private String title;
    private List<SpecValue> specValueList;

    // Getters and Setters
}