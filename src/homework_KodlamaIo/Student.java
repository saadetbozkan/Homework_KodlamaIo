package homework_KodlamaIo;

public class Student extends User {
	private String[] takenCourses = new String[] {};

	public String getTakenCourses() {
		String courses = "";

		for (String takenCourse : this.takenCourses) {

			courses = courses + " " + takenCourse;

		}
		return courses;
	}

	public void setTakenCourses(String[] takenCourses) {
		String courses = "";

		for (String takenCourse : takenCourses) {

			courses = courses + "," + takenCourse;

		}

		this.takenCourses = courses.split(",");
	}

}