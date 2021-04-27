package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		
		course1.id = 001;
		course1.name = "C#";
		course1.teacherName = "Engin";
		course1.teacherSurname = "DEM�RO�";
		course1.detail = "Yaz�l�m Geli�tirici Yeti�tirme Kamp�";
		
		Course course2 = new Course();
		
		course2.id = 002;
		course2.name = "Java";
		course2.teacherName = "Engin";
		course2.teacherSurname = "DEM�RO�";
		course2.detail = "Yaz�l�m Geli�tirici Yeti�tirme Kamp�";
		
		Course course3 = new Course();
		
		course3.id = 003;
		course3.name = "Programlamaya Giri� ��in Temel Kurs";
		course3.teacherName = "Engin";
		course3.teacherSurname = "DEM�RO�";
		course3.detail = "PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.";
		
		Course[] courses = {course1, course2, course3};
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		System.out.println("***********************************************");
		
		Teacher teacher1 = new Teacher();
		
		teacher1.id = 001;
		teacher1.name = "Engin";
		teacher1.surname = "DEM�RO�";
		teacher1.course = "C#, Java, Programlamaya Giri� ��in Temel Kurs";
		teacher1.certificates = "MCT,PMP,ITIL";
		
		Teacher[] teachers = {teacher1};
		for (Teacher teacher : teachers) {
			System.out.println(teacher1.name + " " + teacher.surname);
		}
	}
}
