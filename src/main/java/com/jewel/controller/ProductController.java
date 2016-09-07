package com.jewel.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jewel.dao.ProductDAO;
import com.jewel.model.Product;
@Controller
public class ProductController {
   @Autowired
	ProductDAO dao;
   
	@RequestMapping("/productTableUsers")
	public String viewProduct(Model m) //Model is  a  predefined class which helps in making object
	{
		String list=dao.addProduct();
		m.addAttribute("list", list);
		return "product"; //product.jsp
		
		//List<Product> list=dao.showPro();
		//return new ModelAndView("product","list",list);
	}
	/*@Autowired
	ProductDAO prodao;
	
	@RequestMapping("/Product")
	public ModelAndView showProduct()
	{
		List<Product> list=prodao.add();
		ModelAndView model=new ModelAndView("showProduct", "list" , list);
		
	}*/
}
