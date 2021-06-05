package automation.homeworkoop;

/**
 * @author cosminghicioc
 *
 */
public class Librarytest {

	/**
	 * Method which prints out the result
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Author author = new Author("AUTOR", "author@gmail.com");
		Book book = new Book("CARTE", 2000, author, 20);

		System.out.println("Book " + book.getName() + " (" + book.getPrice() + " RON), by " + book.getAuthor()
				.getName() + ", published in " + book.getYear());
	}
}
