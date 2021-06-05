package automation.homeworkoop2extends;

/**
 * @author cosminghicioc
 *
 */
public class HumanProprities {

	public static void main(String[] args) {

		Swim swimmer = new Swim();
		Walk walker = new Walk();
		Talk talker = new Talk();

		walker.breathe();
		walker.walk();

		talker.breathe();
		System.out.println(talker.talk());

		swimmer.breathe();
		swimmer.walk();
		System.out.println(swimmer.swimerTalks());
		swimmer.swim();

	}

}
