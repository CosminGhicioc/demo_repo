package automation.interfacesclassgroup;

public class Light {

	private boolean isOn;
	private byte intensity = 10;

	public Light() {
		// TODO Auto-generated constructor stub
	}

	public void turnOn() {
		this.isOn = true;
	}

	public void turnOff() {
		this.isOn = false;
	}

	public boolean getIsOn() {
		return isOn;
	}

	public void dim() {
		if (intensity > 0) {
			intensity--;
			if (intensity == 0) {
				turnOff();
			}
		}
	}

	public void brighten() {
		if (intensity < 10) {
			intensity++;
			if (intensity == 1) {
				turnOn();
			}
		}
	}

	// different implementation from above

	public void setIntensity(byte intensity) {
		if (intensity < 0 || intensity > 10) {
			return;
		}

		this.intensity = intensity;
	}

	public byte getIntensity() {
		return intensity;
	}

}
