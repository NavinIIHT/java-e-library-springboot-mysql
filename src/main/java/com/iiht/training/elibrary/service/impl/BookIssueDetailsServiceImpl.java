package com.iiht.training.elibrary.service.impl;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.elibrary.dto.BookIssueDetailsDto;
import com.iiht.training.elibrary.dto.BooksDto;
import com.iiht.training.elibrary.entity.BookIssueDetails;
import com.iiht.training.elibrary.entity.Books;
import com.iiht.training.elibrary.entity.Student;
import com.iiht.training.elibrary.exception.AlreadyIssuedException;
import com.iiht.training.elibrary.exception.BookIssueDetailsNotFoundException;
import com.iiht.training.elibrary.exception.BookNotFoundException;
import com.iiht.training.elibrary.exception.StudentNotFoundException;
import com.iiht.training.elibrary.repository.BookIssueDetailsRepository;
import com.iiht.training.elibrary.repository.BooksRepository;
import com.iiht.training.elibrary.repository.StudentRepository;
import com.iiht.training.elibrary.service.BookIssueDetailsService;
import com.iiht.training.elibrary.service.BooksService;

@Service
public class BookIssueDetailsServiceImpl implements BookIssueDetailsService {

	@Autowired
	private BookIssueDetailsRepository repository;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private BooksRepository booksRepository;

	@Autowired
	private BooksService booksService;

	@Override
	public BookIssueDetailsDto issueBook(Long studentId, Long bookId) {

		return null;
	}

	@Override
	public List<BookIssueDetailsDto> getAllIssuedBooksByStudentId(Long studentId) {
		return null;

	}

	@Override
	public BookIssueDetailsDto returnBook(Long id) {

		return null;
	}

}
