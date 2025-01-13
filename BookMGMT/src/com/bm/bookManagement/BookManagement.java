<<<<<<< HEAD
package com.bm.bookManagement;

public class BookManagement {

	static void displayTop3(Book[] bks) {

	}

	static void displayAllBooks(Book[] bks) {
		for (int iter = 0; iter < 20; iter++) {
			bks[iter].display();
		}
	}

	static void addBookHelper(Book[] bks) {
	}

	static Book searchBookByName(Book[] bks, String bname) {
		return new Book();
	}

	static Book searchBookByID(Book[] bks, int id) {
		return new Book();
	}

	static void updateBook(Book[] bks, int id) {
	}

	static void removeBook(Book[] bks, int id) {
	}

	static void listAllAuthors(Book[] bks) {
	}

	static void listAllCategories(Book[] bks) {
	}

	static void listBooksByAuthor(Book[] bks, String authName) {
	}

	static void listBooksByCategory(Book[] bks, String category) {
	}

	static void sortBooksByRating(Book[] bks, char order) {
	}

	static void sortBooksByPrice(Book[] bks, char order) {
	}

	static void hardCodedBooks(Book[] books) {
		books[0] = new Book(1, "The Lord of the Rings", 29.99, 5.1, "J.R.R. Tolkien", "Fantasy");
		books[1] = new Book(2, "Pride and Prejudice", 14.99, 4.2, "Jane Austen", "Romance");
		books[2] = new Book(3, "To Kill a Mockingbird", 18.99, 5.6, "Harper Lee", "Fiction");
		books[3] = new Book(4, "1984", 12.99, 4.9, "George Orwell", "Dystopian");
		books[4] = new Book(5, "The Hitchhiker's Guide to the Galaxy", 15.99, 5.3, "Douglas Adams", "Science Fiction");
		books[5] = new Book(6, "Harry Potter and the Sorcerer's Stone", 22.99, 5.8, "J.K. Rowling", "Fantasy");
		books[6] = new Book(7, "The Great Gatsby", 16.99, 4.6, "F. Scott Fitzgerald", "Classics");
		books[7] = new Book(8, "The Catcher in the Rye", 13.99, 4.8, "J.D. Salinger", "Classics");
		books[8] = new Book(9, "The Alchemist", 11.99, 5.3, "Paulo Coelho", "Philosophy");
		books[9] = new Book(10, "The Little Prince", 10.99, 5.6, "Antoine de Saint-Exupéry", "Children's Literature");
		books[10] = new Book(11, "War and Peace", 20.99, 4.9, "Leo Tolstoy", "Historical Fiction");
		books[11] = new Book(12, "Moby Dick", 17.50, 4.5, "Herman Melville", "Adventure");
		books[12] = new Book(13, "The Odyssey", 13.99, 4.8, "Homer", "Epic");
		books[13] = new Book(14, "Brave New World", 15.99, 5.2, "Aldous Huxley", "Science Fiction");
		books[14] = new Book(15, "Frankenstein", 11.99, 4.7, "Mary Shelley", "Horror");
		books[15] = new Book(16, "The Divine Comedy", 18.99, 5.4, "Dante Alighieri", "Poetry");
		books[16] = new Book(17, "Don Quixote", 19.99, 4.9, "Miguel de Cervantes", "Classics");
		books[17] = new Book(18, "Crime and Punishment", 14.99, 5.1, "Fyodor Dostoevsky", "Psychological Fiction");
		books[18] = new Book(19, "Jane Eyre", 12.99, 4.8, "Charlotte Brontë", "Gothic Fiction");
		books[19] = new Book(20, "The Hobbit", 21.99, 5.7, "J.R.R. Tolkien", "Fantasy");
	}

}
=======
package com.bm.bookManagement;

public class BookManagement {

	static void displayTop3(Book[] bks) {

	}

	static void displayAllBooks(Book[] bks) {
		for (int iter = 0; iter < 20; iter++) {
			bks[iter].display();
		}
	}

	static void addBookHelper(Book[] bks) {
	}

	static Book searchBookByName(Book[] bks, String bname) {
		return new Book();
	}

	static Book searchBookByID(Book[] bks, int id) {
		return new Book();
	}

	static void updateBook(Book[] bks, int id) {
	}

	static void removeBook(Book[] bks, int id) {
	}

	static void listAllAuthors(Book[] bks) {
	}

	static void listAllCategories(Book[] bks) {
	}

	static void listBooksByAuthor(Book[] bks, String authName) {
	}

	static void listBooksByCategory(Book[] bks, String category) {
	}

	static void sortBooksByRating(Book[] bks, char order) {
	}

	static void sortBooksByPrice(Book[] bks, char order) {
	}

	static void hardCodedBooks(Book[] books) {
		books[0] = new Book(1, "The Lord of the Rings", 29.99, 5.1, "J.R.R. Tolkien", "Fantasy");
		books[1] = new Book(2, "Pride and Prejudice", 14.99, 4.2, "Jane Austen", "Romance");
		books[2] = new Book(3, "To Kill a Mockingbird", 18.99, 5.6, "Harper Lee", "Fiction");
		books[3] = new Book(4, "1984", 12.99, 4.9, "George Orwell", "Dystopian");
		books[4] = new Book(5, "The Hitchhiker's Guide to the Galaxy", 15.99, 5.3, "Douglas Adams", "Science Fiction");
		books[5] = new Book(6, "Harry Potter and the Sorcerer's Stone", 22.99, 5.8, "J.K. Rowling", "Fantasy");
		books[6] = new Book(7, "The Great Gatsby", 16.99, 4.6, "F. Scott Fitzgerald", "Classics");
		books[7] = new Book(8, "The Catcher in the Rye", 13.99, 4.8, "J.D. Salinger", "Classics");
		books[8] = new Book(9, "The Alchemist", 11.99, 5.3, "Paulo Coelho", "Philosophy");
		books[9] = new Book(10, "The Little Prince", 10.99, 5.6, "Antoine de Saint-Exupéry", "Children's Literature");
		books[10] = new Book(11, "War and Peace", 20.99, 4.9, "Leo Tolstoy", "Historical Fiction");
		books[11] = new Book(12, "Moby Dick", 17.50, 4.5, "Herman Melville", "Adventure");
		books[12] = new Book(13, "The Odyssey", 13.99, 4.8, "Homer", "Epic");
		books[13] = new Book(14, "Brave New World", 15.99, 5.2, "Aldous Huxley", "Science Fiction");
		books[14] = new Book(15, "Frankenstein", 11.99, 4.7, "Mary Shelley", "Horror");
		books[15] = new Book(16, "The Divine Comedy", 18.99, 5.4, "Dante Alighieri", "Poetry");
		books[16] = new Book(17, "Don Quixote", 19.99, 4.9, "Miguel de Cervantes", "Classics");
		books[17] = new Book(18, "Crime and Punishment", 14.99, 5.1, "Fyodor Dostoevsky", "Psychological Fiction");
		books[18] = new Book(19, "Jane Eyre", 12.99, 4.8, "Charlotte Brontë", "Gothic Fiction");
		books[19] = new Book(20, "The Hobbit", 21.99, 5.7, "J.R.R. Tolkien", "Fantasy");
	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
