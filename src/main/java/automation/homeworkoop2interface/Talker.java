package automation.homeworkoop2interface;

/**
 * @author cosminghicioc Class talker which implements interface methods breathe and talk
 */
public class Talker implements PersonBreathe, PersonTalk {

	/**
	 * Overriding the interface method breathe for talker
	 */
	@Override
	public void breathe() {
		System.out.println("Talker can breathe");
	}

	/**
	 * Overriding the interface method talk for talker
	 */
	@Override
	public void talk() {
		System.out.println("Talker can talk");
	}
}
