<<<<<<< HEAD
package com.bm.bookManagement;

public class Book {
	private int bId;
	private String bookTitle;
	private double price;
	private double rating;
	private String author;
	private String category;

	Book() {

	}

	Book(int bId, String bookTitle, double price, double rating, String author, String category) {
		this.bId = bId;
		this.bookTitle = bookTitle;
		this.price = price;
		this.rating = rating;
		this.author = author;
		this.category = category;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void display() {
		System.out.println("Book id   : " + this.bId);
		System.out.println("Book Title: " + this.bookTitle);
		System.out.println("Book id  : " + this.bId);

	}

}
=======
package com.bm.bookManagement;

public class Book {
	private int bId;
	private String bookTitle;
	private double price;
	private double rating;
	private String author;
	private String category;

	Book() {

	}

	Book(int bId, String bookTitle, double price, double rating, String author, String category) {
		this.bId = bId;
		this.bookTitle = bookTitle;
		this.price = price;
		this.rating = rating;
		this.author = author;
		this.category = category;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void display() {
		System.out.println("Book id   : " + this.bId);
		System.out.println("Book Title: " + this.bookTitle);
		System.out.println("Book id  : " + this.bId);

	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
