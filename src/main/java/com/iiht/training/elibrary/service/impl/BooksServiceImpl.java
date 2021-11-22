package com.iiht.training.elibrary.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.elibrary.dto.BooksDto;
import com.iiht.training.elibrary.entity.BookIssueDetails;
import com.iiht.training.elibrary.entity.Books;
import com.iiht.training.elibrary.repository.BookIssueDetailsRepository;
import com.iiht.training.elibrary.repository.BooksRepository;
import com.iiht.training.elibrary.service.BooksService;

@Service
public class BooksServiceImpl implements BooksService {

	@Autowired
	private BooksRepository booksRepository;

	@Autowired
	private BookIssueDetailsRepository repository;

	@Override
	public BooksDto saveBooks(BooksDto booksDto) {

		return null;
	}

	@Override
	public List<BooksDto> getAllIssuedBooks() {

		return null;
	}

	@Override
	public BooksDto updateBook(BooksDto booksDto) {
		return null;
	}

	@Override
	public List<BooksDto> getAllBooksByStream(String stream) {

		return null;
	}

	@Override
	public List<BooksDto> getAllIssuedBooksWithFine() {
		return null;
	}

}
