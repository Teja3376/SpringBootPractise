package com.st33.teja.controllerlayer;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.st33.teja.beanlayer.Product;
import com.st33.teja.daoLayer.ProductNotFoundException;
import com.st33.teja.servicelayer.ProductService;



@RestController
@RequestMapping(value="product")

////Connecting ... to Angular 
//@CrossOrigin("http://localhost:4200")

public class ProductController {
	
	@Autowired
    private ProductService service ;
	
	
	@PostMapping(path="/create")
	public ResponseEntity<Boolean> CreateProduct(@RequestBody Product pdt) {
		service.CreateProduct(pdt);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}
	
	@GetMapping(path="/getdetails/{pno}")
	public ResponseEntity<Product> findProductById(@PathVariable("pno") long pno) {
		Product pdt=service.findProductById(pno);
		if (pdt == null) {
            throw new ProductNotFoundException ("Product not found for id=" + pno);
        }
		return new ResponseEntity<Product>(pdt,new HttpHeaders(),HttpStatus.OK);
	}
	
	//   http://localhost:9999/product/getAll
	
	@GetMapping(path="/getAll")
	public  ResponseEntity<List<Product>> findAll(@RequestParam("pno") long pno){
		List<Product> list=service.findAllProducts();
		
		HttpHeaders re = new HttpHeaders();
		re.add("Status", "Data Retrieved");
		return new ResponseEntity<List<Product>>(list, re, HttpStatus.OK);
	}
	
	@PutMapping(path="/update")
	public ResponseEntity<Product> updateProduct(@RequestBody Product pdt){
		pdt=service.updateProduct(pdt);
		return new ResponseEntity<Product>(pdt,new HttpHeaders(),HttpStatus.OK);
	}
	
	@DeleteMapping(path="/delete/{pno}")
	public String deleteProduct(@PathVariable("pno") Long pno) {
		service.deleteProduct(pno);
		return "Deleted";
	}
}