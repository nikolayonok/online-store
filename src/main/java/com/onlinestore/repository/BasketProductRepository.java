package com.onlinestore.repository;

import com.onlinestore.entity.BasketProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketProductRepository extends JpaRepository<BasketProduct, Long> {
}
