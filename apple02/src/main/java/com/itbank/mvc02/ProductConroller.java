package com.itbank.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductConroller {
	
	
	@RequestMapping("insert2")
	public void insert(ProductDTO productDTO , ProductDAO productDAO) {
		productDAO.insert(productDTO);
	}
	
	@RequestMapping("delete")
	public void delete(ProductDTO productDTO , ProductDAO productDAO) {
		productDAO.delete(productDTO);
	}
	
	@RequestMapping("confirm")
	public void search(ProductDTO productDTO , ProductDAO productDAO) {
		productDAO.search(productDTO);
	}
	@RequestMapping("confirm2")
	public void search2(ProductDTO productDTO , ProductDAO productDAO) {
		productDAO.search2(productDTO);
	}

}
