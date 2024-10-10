package com.example.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private int id;
    private String name;
    private int rateScore;
    private int productCategoryId;
    private int productStyleId;
    private String description;
    private int quantityReviewer;
    private Time offer_expire;

}
