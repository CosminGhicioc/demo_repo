package automation.homeworkoop2interface;

/**
 * @author cosminghicioc Class swimmer which implements interface methods breathe, walk, talk and swim
 */
public class Swimmer implements PersonBreathe, PersonWalk, PersonTalk, PersonSwim {

	/**
	 * Overriding the interface method breathe for swimmer
	 */
	@Override
	public void breathe() {
		System.out.println("Swimmer can breathe");
	}

	/**
	 * Overriding the interface method walk for swimmer
	 */
	@Override
	public void walk() {
		System.out.println("Swimmer can walk");
	}

	/**
	 * Overriding the interface method talk for swimmer
	 */
	@Override
	public void talk() {
		System.out.println("Swimmer can talk");
	}

	/**
	 * Overriding the interface method swim for swimmer
	 */
	@Override
	public void swim() {
		System.out.println("Swimmer can swim");
	}
}
