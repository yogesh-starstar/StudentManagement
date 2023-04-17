package com.BhikkadIT.ControllerToUIDataSend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BhikkadIT.ControllerToUIDataSend.model.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public ModelAndView getBook() {
		
		Book book =new Book();
		book.setBookId(11);
		book.setBookName("Java");
		book.setBookPrice(123.00);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("BOOK", book);
		mv.setViewName("book");
		return mv;

	}
	
	@GetMapping("/getALlBooks")
	public String getALlBooks(Model model){
	
		Book b=new Book();
		b.setBookId(111);
		b.setBookName("Java");
		b.setBookPrice(123.00);
		
		Book b1=new Book();
		b1.setBookId(222);
		b1.setBookName("C");
		b1.setBookPrice(143.00);
		
		Book b2=new Book();
		b2.setBookId(333);
		b2.setBookName("Python");
		b2.setBookPrice(890.00);
		
		List al=new ArrayList();
		al.add(b);
		al.add(b1);
		al.add(b2);
		
		model.addAttribute("listbook", al);
		
		return "books";
		
	}
	

}
