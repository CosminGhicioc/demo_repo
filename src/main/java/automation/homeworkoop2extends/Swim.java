package automation.homeworkoop2extends;

/**
 * @author cosminghicioc
 *
 */
public class Swim extends Walk {

	private Talk talk;

	/**
	 * Method which returns swim to a caller
	 */
	public void swim() {
		System.out.println("I can swim");
	}

	/**
	 * @return Method which gives talk to swimmer
	 */
	public String swimerTalks() {
		this.talk = new Talk();
		return talk.talk();
	}
}
