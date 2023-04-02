package com.example.mvcbooktracker;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepo extends MongoRepository <Book,String>{
	public List<Book> findAll();
}
