package automation.classactivityperson;

public class Student extends Person {

	private byte yearOfStudy;
	private String classId;
	private String majorField;
	private int registrationNumber;

	public byte getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(byte yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getMajorField() {
		return majorField;
	}

	public void setMajorField(String majorField) {
		this.majorField = majorField;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

}
