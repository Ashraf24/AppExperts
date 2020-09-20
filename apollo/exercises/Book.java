package apollo.exercises.ch06_classes;

// EX1_BookRunner

//1) Create a new class called Book.

public class Book {

//2) Create fields for title, author, numPages, and isbn.	

 String title;
   User author;
  int numPages;
  int isbn;

public Book(String t, User a, int n, int i) {
	
this.title=t;
this.author=a;
this.numPages=n;
this.isbn=i;
}
  
  
// 3) Create a method called toString that appropriately describes the book.	

public String toString()
{
String str="The Title: "+title+" Author: "+author+" Numpages: "+numPages +" ISBN: "+isbn ;

return str;
	
}



}
