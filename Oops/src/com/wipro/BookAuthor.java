package com.wipro;
class Author{
	private String name;
	private String email;
	private char gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
}
class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInstock;
	public String getName() {
		return name;
	}
	public Book(String name, Author author, double price, int qtyInstock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInstock = qtyInstock;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInstock() {
		return qtyInstock;
	}
	public void setQtyInstock(int qtyInstock) {
		this.qtyInstock = qtyInstock;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qtyInstock=" + qtyInstock + "]";
	}
	
	
}
public class BookAuthor {
	public static void main(String args[]) {
		Author author=new Author("john","John@123",'m');
		Book book=new Book("Devil",author,10000,5);
		System.out.println(book);
	}
}
