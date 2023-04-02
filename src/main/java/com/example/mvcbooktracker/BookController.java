package com.example.mvcbooktracker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BookController {

	@Autowired
	public MongoRepo repo;

	@GetMapping("/")
	public String homepage(Model model){
		return "homepage";
	}

	@GetMapping("/viewbooks")
	public String viewBooks(Model model) {
		List<Book> books = repo.findAll();
		model.addAttribute("allbooks",books);
		return "viewbooks";
	}
	
	@GetMapping("/addbook")
	public String addBook(Model model) {
		model.addAttribute("book",new Book());
		return "addbook";
	}

	@PostMapping("/addbook")
	public String submitBook(@ModelAttribute("book") Book book) {
		repo.save(book);
		return "redirect:viewbooks";
	}
}