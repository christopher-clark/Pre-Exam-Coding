package experiments;
import java.util.*;

public class Library {

	private Book book;
	private Customer customer;
		
	private List<Book> booklist = new ArrayList<Book>();
	private Set<Customer> customers = new TreeSet<Customer>(); 
	
	public static final int MAX_NUMBER_OF_RENTALS = 5;
	
	public boolean checkAvailability(Book b){
		if(booklist.contains(book))
			return true;
		else
			return false;
	}
	public void createBookEntry(String title,String author,int isbn,boolean available){
		Book book = new Book();
		book.setTitle(title);
		book.setAuthor(author);
		book.setIsbn(isbn);
		book.setAvailable(true);
	}
	public void addBookToLibrary(Book book){
		booklist.add(book);
	}
	public void createCustomerEntry(String firstName, String lastName,int age, Address address, int numberOfRentals){
		Customer customer = new Customer();
		
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setAge(age);
		customer.setAddress(address);
		customer.setNumberOfRentals(0);
	}
	public void addCustomerToCustomerList(Customer customer){
		customers.add(customer);
	}
}