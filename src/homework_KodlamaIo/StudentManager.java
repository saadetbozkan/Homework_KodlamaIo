package homework_KodlamaIo;

public class StudentManager extends UserManager{

	public void joinCourse(Student student, String course) {
		String courses = student.getTakenCourses() + "," + course;
		student.setTakenCourses(courses.split(","));
		System.out.println(student.getName() + " " +course +  " Kursuna eklendi.");

	}

}
