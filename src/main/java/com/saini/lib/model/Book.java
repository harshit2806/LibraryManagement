package com.saini.lib.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class Book {
	    @Id
		private Integer bookIdNo;
		private String  bookName;
		private String  authorName;
		private Integer noOfBooks;
		
		public Integer getBookIdNo() {
			return bookIdNo;
		}
		public void setBookIdNo(Integer bookIdNo) {
			this.bookIdNo = bookIdNo;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public Integer getNoOfBooks() {
			return noOfBooks;
		}
		public void setNoOfBooks(Integer noOfBooks) {
			this.noOfBooks = noOfBooks;
		}
}
