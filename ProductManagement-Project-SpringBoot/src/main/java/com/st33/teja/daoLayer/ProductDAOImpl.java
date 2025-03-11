package com.st33.teja.daoLayer;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.st33.teja.beanlayer.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {
	
	@PersistenceContext
    private EntityManager entityManager;

	@Override
	public Product CreateProduct(Product pdt) {
		return entityManager.merge(pdt);
	}

	@Override
	public Product findProductById(long pno) {
		return entityManager.find(Product.class,pno);
	}

	@Override
	public Product updateProduct(Product product) {
		//Employee emp=entityManager.find(Employee.class,employee.getEmpId());
		Product pdt=findProductById(product.getPno());
		pdt.setPname(product.getPname());
		pdt.setPrice(product.getPrice());
		pdt=entityManager.merge(pdt);
		return pdt;
	}
	
	@Override
	public List<Product> findAllProducts() {
		Query q = entityManager.createQuery("select p from Product p");
	    List<Product> list=q.getResultList();
		return list; //
		
	}
	
	
	
	@Override
	public void deleteProduct(long pno) {
		Product pdt=entityManager.find(Product.class, pno);
		entityManager.remove(pdt);
	}

}