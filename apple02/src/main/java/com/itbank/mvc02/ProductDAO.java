package com.itbank.mvc02;

import com.itbank.mvc02.ProductDTO;

public class ProductDAO {
	
public void insert(ProductDTO productDTO) {
		
		System.out.println("DB연동해서  insert sql문 실행함!!");
		System.out.println("입력할 ID: "+productDTO.getProductid());
		System.out.println("입력할 NAME: "+productDTO.getProductname());
		System.out.println("입력할 PRICE: "+productDTO.getProductprice());
		System.out.println("입력할 MILE: "+productDTO.getProductmile());
		
	}


public void delete(ProductDTO productDTO) {
	
	System.out.println("DB연동해서  delete sql문 실행함!!");
	System.out.println("삭제할 ID: "+productDTO.getProductid());
	System.out.println("삭제할 NAME: "+productDTO.getProductname());
	System.out.println("삭제할 PRICE: "+productDTO.getProductprice());
	System.out.println("삭제할 MILE: "+productDTO.getProductmile());
	
}


public void search(ProductDTO productDTO) {
	
	System.out.println("DB연동해서  search sql문 실행함!!");
	System.out.println("검색한 NAME: "+productDTO.getProductid());
	System.out.println("검색한 PW: "+productDTO.getProductname());
	System.out.println("검색한 PRICE: "+productDTO.getProductprice());
	System.out.println("검색한 MILE: "+productDTO.getProductmile());
	
}


public void search2(ProductDTO productDTO) {
	
	System.out.println("DB연동해서  search sql문 실행함!!");
	System.out.println("수정전 NAME: "+productDTO.getProductid());
	System.out.println("수정전 PW: "+productDTO.getProductname());
	System.out.println("수정전 PRICE: "+productDTO.getProductprice());
	System.out.println("수정전 MILE: "+productDTO.getProductmile());
	
	
	productDTO.setProductmile("0");
	
	System.out.println("수정후 NAME: "+productDTO.getProductid());
	System.out.println("수정후 PW: "+productDTO.getProductname());
	System.out.println("수정후 PRICE: "+productDTO.getProductprice());
	System.out.println("수정후 MILE: "+productDTO.getProductmile());
}

}
