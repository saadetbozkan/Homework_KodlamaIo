package homework_KodlamaIo;

public class InstructorManager extends UserManager {

	public void addCourse(Instructor instructor, String course) {
		String courses = instructor.getGivenCourse() + "," + course;
		instructor.setGivenCourse(courses.split(","));
		System.out.println(instructor.getName() + " " + course + "  kursunu ekledi ");
	}

	public void deleteCourse(Instructor instructor, String course) {
		String[] givenCourses = instructor.getGivenCourse().split(",");
		String courses = "";
		for (String givenCourse : givenCourses) {

			if (givenCourse != course) {
				courses = courses + "," + givenCourse;
			}

		}
		instructor.setGivenCourse(courses.split(","));

		System.out.println("Kurs silindi");

	}

	public void updateCourse(Instructor instructor, String course, String updateCourse) {
		String[] givenCourses = instructor.getGivenCourse().split(",");
		String courses = "";
		for (String givenCourse : givenCourses) {

			if (givenCourse == course) {
				courses = courses + "," + updateCourse;
			} else {
				courses = courses + "," + givenCourse;

			}
		}
		System.out.println("Kurs guncellendi" +" " +  updateCourse);
	}

}