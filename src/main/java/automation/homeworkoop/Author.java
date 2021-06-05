package automation.homeworkoop;

/**
 * @author cosminghicioc
 *
 */
public class Author {

	private String name;
	private String email;

	/**
	 * Constructor used to create objects
	 * 
	 * @param name
	 * @param email
	 */
	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}

	/**
	 * Method which gets the name of author
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method which gets the email of author
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

}
