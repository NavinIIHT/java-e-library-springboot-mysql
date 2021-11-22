package com.iiht.training.elibrary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.elibrary.dto.BooksDto;
import com.iiht.training.elibrary.dto.StudentDto;
import com.iiht.training.elibrary.repository.BooksRepository;
import com.iiht.training.elibrary.repository.StudentRepository;
import com.iiht.training.elibrary.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Autowired
	private BooksRepository booksRepository;

	@Override
	public StudentDto registerStudent(StudentDto studentDto) {
		return null;
	}

	@Override
	public List<BooksDto> getAllBooksByStudentStream(Long id) {

		return null;
	}

	@Override
	public StudentDto findById(Long id) {
		return null;
	}

}
