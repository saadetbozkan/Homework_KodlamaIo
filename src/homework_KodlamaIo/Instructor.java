package homework_KodlamaIo;

public class Instructor extends User {
	private String detail;
	private String[] givenCourse = new String[] {};

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getGivenCourse() {

		String courses = "";

		for (String takenCourse : this.givenCourse) {

			courses = courses + " " + takenCourse;

		}
		return courses;
	}

	public void setGivenCourse(String[] givenCourse) {

		String courses = "";

		for (String takenCourse : givenCourse) {

			courses = courses + "," + takenCourse;

		}

		this.givenCourse = courses.split(",");

	}
}
