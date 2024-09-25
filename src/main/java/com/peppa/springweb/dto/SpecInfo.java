package com.peppa.springweb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpecInfo {
    private String specId;
    private String specValueId;

    // Getters and Setters
}