package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productsRepository extends JpaRepository<Products,Integer> {
}
