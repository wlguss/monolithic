package com.example.monolithic.product.domain.dto;

import com.example.monolithic.product.domain.entity.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDTO {
    private String name ; 
    private int price ;
    private int stockQty ;

    public static ProductRequestDTO fromEntity(ProductEntity entity){
        return ProductRequestDTO.builder().name(entity.getName()).price(entity.getPrice())
        .stockQty(entity.getStockQty()).build() ;
    }
}
