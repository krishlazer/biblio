package krish.library.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService 
{

	@Autowired
	BookDAO bookDAO;
	
	@Override
	public void addBook(Book bk1) 
	{
		bookDAO.addBook(bk1);

	}

	@Override
	public void updateBook(Book bk1)
	{
		
		bookDAO.updateBook(bk1);
		
	}
	
	
	@Override
	public Book editBook(int ISBN) 
	{
		return bookDAO.editBook(ISBN);
	}

	@Override
	public void deleteBook(int ISBN) 
	{
		bookDAO.deleteBook(ISBN);
	}

	@Override
	public Book findBook(int ISBN) 
	{
		
		return bookDAO.findBook(ISBN);
		
	}

	@Override
	public List<Book> getAllBooks() 
	{
		
		return bookDAO.getAllBooks();
	}

}
