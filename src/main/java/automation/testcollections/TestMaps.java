package automation.testcollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import automation.inheritance.Circle;

public class TestMaps {

	public static void main(String[] array) {

		testMap();

	}

	public static void testMap() {

		Circle circle = new Circle();
		Circle circle1 = new Circle();

		Map<Integer, Circle> map1 = new HashMap<>();

		map1.put(1, circle);
		map1.put(2, circle1);

		map1.replace(1, null);

		Collection<Circle> collection = map1.values();
		System.out.println(collection.size());

		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.size());
	}

	public void rawList() {

	}

}
