package krish.library.collection;

import java.util.List;

public interface BookDAO 
{
	public void addBook(Book bk1);
	public void updateBook(Book bk1);
	public Book editBook(int ISBN);
	public void deleteBook(int ISBN);
	public Book findBook (int ISBN);
	public List<Book> getAllBooks();
	
}
