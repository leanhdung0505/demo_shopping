package com.example.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductItemDto {
    private int id;
    private int productId;
    private int colorId;
    private int sizeId;
    private Long originalPrice;
    private Long salePrice;

}
