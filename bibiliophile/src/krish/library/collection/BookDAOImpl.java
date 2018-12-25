package krish.library.collection;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	
	protected Session currentSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void addBook(Book bk1) 
	{
		currentSession().save(bk1);

	}
	
	@Override
	public void updateBook(Book bk1)
	{
		currentSession().update(bk1);
		
	}

	@Override
	public Book editBook(int ISBN) 
	{
		
		return findBook(ISBN);

	}

	@Override
	public void deleteBook(int ISBN) 
	{
		
		currentSession().delete(ISBN);
	}

	@Override
	public Book findBook(int ISBN) 
	{
		return (Book)currentSession().get(Book.class, ISBN);
		
	}

	@Override
	public List<Book> getAllBooks() 
	{
		
		return currentSession().createCriteria(Book.class).list();
	}

}
