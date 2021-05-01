package homework_KodlamaIo;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("Saadet");
		student.seteMail("a@a.com");
		student.setPassword("1234");
		
		StudentManager studentManager = new StudentManager();
		studentManager.singIn(student);
		studentManager.joinCourse(student, "Java+React");
		studentManager.joinCourse(student, "C#+Angular");
		System.out.println("Alınan tum kurslar : " + student.getTakenCourses());
		studentManager.singOut(student);
		
		System.out.println("**********************************");
	
		Instructor instructor = new Instructor();
		instructor.setName("Engin Demirog");
		instructor.seteMail("b@b.com");
		instructor.setPassword("54123");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.singIn(instructor);
		instructorManager.addCourse(instructor, "Java+React");
		System.out.println("Verilen tum kurslar : " + instructor.getGivenCourse());
		instructorManager.updateCourse(instructor, "Java+React", "C#+Angular");
		System.out.println("Verilen tum kurslar : " + instructor.getGivenCourse());
		instructorManager.deleteCourse(instructor, "C#+Angular");
		System.out.println("Verilen tum kurslar : " + instructor.getGivenCourse());
		instructorManager.singOut(instructor);
		
		
		
		
	}

}
