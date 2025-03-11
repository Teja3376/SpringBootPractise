package com.st33.teja.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepostiory extends CrudRepository<ProductsBean, Integer> {

}
