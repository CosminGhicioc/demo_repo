package automation.homeworkoop2interface;

/**
 * @author cosminghicioc Class walker which implements interface methods breathe and walk
 */
public class Walker implements PersonBreathe, PersonWalk {

	/**
	 * Overriding the interface method breathe for walker
	 */
	@Override
	public void breathe() {
		System.out.println("Walker can breathe");
	}

	/**
	 * Overriding the interface method walk for walker
	 */
	@Override
	public void walk() {
		System.out.println("Walker can walk");
	}
}
