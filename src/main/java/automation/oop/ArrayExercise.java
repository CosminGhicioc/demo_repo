package automation.oop;

import automation.interfacesclassgroup.Light;

public class ArrayExercise {

	public static void main(String[] args) {

		// Light lightBulb = new Light();
		Light[] lights = { new Light(), new Light() };

		System.out.println(lights.length);

		Light light = lights[1];
		light.brighten();
		System.out.println(light.getIntensity());

		// -----------------------

		Light[] lights2 = new Light[2];
		lights2[1] = new Light();

		System.out.println(lights2.length);

		System.out.println(lights2[1].getIntensity());

		for (int i = 0; i < lights.length; i++) {
			// System.out.println(lights[i].getIntensity());
			System.out.println(lights[i].getIsOn());

		}
	}

}
