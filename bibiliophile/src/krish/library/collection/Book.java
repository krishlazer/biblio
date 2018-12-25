package krish.library.collection;

public class Book 
{
	private int ISBN;
	private String Title;
	private String Classification;
	private String CallNo;
	private int PublishedYear;
	private String Country;
	
	
	public int getISBN() 
	{
		return ISBN;
	}
	public void setISBN(int ISBN) 
	{
		this.ISBN = ISBN;
	}
	public String getTitle() 
	{
		return Title;
	}
	
	public void setTitle(String Title) 
	{
		this.Title = Title;
	}
	public String getClassification() 
	{
		return Classification;
	}
	public void setClassification(String Classification)
	{
		this.Classification = Classification;
	}
	public String getCallNo() 
	{
		return CallNo;
	}
	public void setCallNo(String CallNo) 
	{
		this.CallNo = CallNo;
	}
	public int getPublishedYear() 
	{
		return PublishedYear;
	}
	public void setPubishedYear(int PublishedYear) 
	{
		this.PublishedYear = PublishedYear;
	}
	public String getCountry() 
	{
		return Country;
	}
	public void setCountry(String Country) 
	{
		this.Country = Country;
	
	}

	public Book(int ISBN, String Title, String Classification, String CallNo, int PublishedYear, String Country) 
	{
		this.ISBN = ISBN;
		this.Title = Title;
		this.Classification = Classification;
		this.CallNo = CallNo;
		this.PublishedYear = PublishedYear;
		this.Country = Country;
	}
}
