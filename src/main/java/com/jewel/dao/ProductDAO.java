package com.jewel.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.jewel.model.Product;





@Repository
public class ProductDAO 
{
	List<Product> prod;
	
	public String addProduct()
	{
		//String product_name, String product_id, String supplier_id, long price, int quantity,
		//String decsription, String category
		
		Gson gson=new Gson();
		prod=new ArrayList<Product>();
		prod.add(new Product("Square Diamond Ring", "RD_S1", "S_01", 80000, 5, "Finally cut edges", "Ring"));
		prod.add(new Product("Round Diamond Necklace", "ND_R1", "S_02", 120000, 2, "flexible", "Necklace"));
		prod.add(new Product("long Nose pin", "NP_L1", "S_04", 5000, 10, "Best suited for traditional occassions", "Nose Pin"));
		prod.add(new Product("Sleek Ear Rings", "ER_S", "S_03", 50000, 5, "Beautiful dropping from ear", "Ear Rings"));
		prod.add(new Product("Square Diamond Ring", "RD_D2", "S_05", 39000, 7, "Finally cut edges", "Ring"));
	String jsonInString=gson.toJson(prod);
	return jsonInString;
	}

}
