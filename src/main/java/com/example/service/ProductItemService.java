package com.example.service;

import com.example.payload.ProductItemDto;

import java.util.List;
import java.util.Optional;

public interface ProductItemService {
    List<ProductItemDto> getAllProductItems();

    Optional<ProductItemDto> getProductItemById(int id);

    ProductItemDto saveProductItem(ProductItemDto productitem);

    void deleteProductItem(int id);

}
