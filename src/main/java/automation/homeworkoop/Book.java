package automation.homeworkoop;

/**
 * @author cosminghicioc
 *
 */
public class Book {

	private String name;
	private int year;
	private Author author;
	private double price;

	/**
	 * Constructor used to create objects
	 * 
	 * @param name
	 * @param year
	 * @param author
	 * @param price
	 */
	public Book(String name, int year, Author author, double price) {
		this.name = name;
		this.year = year;
		this.author = author;
		this.price = price;
	}

	/**
	 * Method which gets the name of the book
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method which gets the year of the book
	 * 
	 * @return
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Method which gets the author of the book
	 * 
	 * @return
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * Method which gets the price of the book
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}

}
