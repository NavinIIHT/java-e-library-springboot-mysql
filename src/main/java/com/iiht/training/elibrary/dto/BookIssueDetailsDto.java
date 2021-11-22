package com.iiht.training.elibrary.dto;

import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BookIssueDetailsDto {

	private Long id;
	private Long bookId;
	private Long studentId;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate issueDate;
	private LocalDate expectedReturnedDate;
	private LocalDate actualReturnedDate;
	private Integer fine;
	private Boolean isReturned;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpectedReturnedDate() {
		return expectedReturnedDate;
	}

	public void setExpectedReturnedDate(LocalDate expectedReturnedDate) {
		this.expectedReturnedDate = expectedReturnedDate;
	}

	public LocalDate getActualReturnedDate() {
		return actualReturnedDate;
	}

	public void setActualReturnedDate(LocalDate actualReturnedDate) {
		this.actualReturnedDate = actualReturnedDate;
	}

	public Integer getFine() {
		return fine;
	}

	public void setFine(Integer fine) {
		this.fine = fine;
	}

	public Boolean getIsReturned() {
		return isReturned;
	}

	public void setIsReturned(Boolean isReturned) {
		this.isReturned = isReturned;
	}

	@Override
	public int hashCode() {
		return Objects.hash(actualReturnedDate, bookId, expectedReturnedDate, fine, id, isReturned, issueDate,
				studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookIssueDetailsDto other = (BookIssueDetailsDto) obj;
		return Objects.equals(actualReturnedDate, other.actualReturnedDate) && Objects.equals(bookId, other.bookId)
				&& Objects.equals(expectedReturnedDate, other.expectedReturnedDate) && Objects.equals(fine, other.fine)
				&& Objects.equals(id, other.id) && Objects.equals(isReturned, other.isReturned)
				&& Objects.equals(issueDate, other.issueDate) && Objects.equals(studentId, other.studentId);
	}

}
