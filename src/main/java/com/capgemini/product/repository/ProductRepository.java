package com.capgemini.product.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.product.entities.Product;


@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {   

	
	//	public Product findProductByName(String productName);
	@Query("{'productCategory':?0}")
	public List<Product> findByProductCategory(String category);
	
	@Query("{'productName':?0}")
	public List<Product> findProductByName(String name);
}
