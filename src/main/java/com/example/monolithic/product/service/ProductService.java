package com.example.monolithic.product.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.monolithic.product.dao.ProductRepository;
import com.example.monolithic.product.domain.dto.ProductRequestDTO;
import com.example.monolithic.product.domain.dto.ProductResponseDTO;
import com.example.monolithic.user.dao.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository ;
    private final UserRepository userRepository ;

    // 상품 등록(로그인한 사용자 정보가 context holder에 저장되어 있음 !!)
    public ProductResponseDTO productCreate(ProductRequestDTO request){
        System.out.println("product service productCreate call");

        return null ;
    }
    
}
