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
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDTO {
    private String name;
    private int price;
    private int stockQty ;

    // 사용자 정보는 테이블에서 가져오는 것이 아닌 로그인 이후 발급받은 토큰 정보로 획득 
    public ProductEntity toEntity(){
        return ProductEntity.builder().name(name).price(price).stockQty(stockQty).build();
    }
}
