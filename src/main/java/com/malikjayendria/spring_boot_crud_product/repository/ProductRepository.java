package com.malikjayendria.spring_boot_crud_product.repository;

import com.malikjayendria.spring_boot_crud_product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

