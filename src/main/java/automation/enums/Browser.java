package automation.enums;

public enum Browser {

	CHROME("77"), //
	FIREFOX("78"), //
	IE("993"), //
	OPERA("9.9.3");

	private String version;

	Browser(String version) {
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

}
