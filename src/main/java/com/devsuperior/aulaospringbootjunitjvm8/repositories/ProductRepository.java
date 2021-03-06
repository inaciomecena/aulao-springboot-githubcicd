package com.devsuperior.aulaospringbootjunitjvm8.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.aulaospringbootjunitjvm8.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
