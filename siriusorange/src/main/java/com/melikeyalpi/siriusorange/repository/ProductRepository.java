package com.melikeyalpi.siriusorange.repository;

import com.melikeyalpi.siriusorange.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
