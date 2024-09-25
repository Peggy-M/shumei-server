package com.peppa.springweb.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TitleList {
    private String text;
    private int key;

    public String getText() {
        return text;
    }

    public int getKey() {
        return key;
    }
}