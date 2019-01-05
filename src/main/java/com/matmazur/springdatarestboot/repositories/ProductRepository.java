package com.matmazur.springdatarestboot.repositories;

import com.matmazur.springdatarestboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "products")
public interface ProductRepository extends JpaRepository<Product,Long> {
}
