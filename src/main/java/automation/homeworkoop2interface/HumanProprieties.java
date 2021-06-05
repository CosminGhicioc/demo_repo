package automation.homeworkoop2interface;

/**
 * @author cosminghicioc
 *
 */
public class HumanProprieties {

	public static void main(String[] args) {

		Walker walker = new Walker();
		Talker talker = new Talker();
		Swimmer swimmer = new Swimmer();

		walker.breathe();
		walker.walk();

		talker.breathe();
		talker.talk();

		swimmer.breathe();
		swimmer.walk();
		swimmer.talk();
		swimmer.swim();

	}
}
