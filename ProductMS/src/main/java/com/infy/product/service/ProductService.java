package com.infy.product.service;

import java.util.List;

import com.infy.product.dto.ProductDTO;

public interface ProductService {
public String addProduct(ProductDTO productDTO) ;
	
	public String deleteProduct(String id) ;
	
	public ProductDTO getProductByName(String name);
	
	public List<ProductDTO> getProductByCategory(String category);
	
	public ProductDTO getProductById(String id);

	public Boolean updateStockOfProd(String prodId, Integer quantity);
	
	public List<ProductDTO> viewAllProducts();
}
