package main;

public class Reportgenerator {
		private GPA gpaservice;
		public Reportgenerator() {
			this.gpaservice= new GPA();
		}
		public void generateReport(Student student, Report printer) {
			String gpa = gpaservice.calculateGPA(student);
			printer.print(student.getName(), gpa);
			
		}
}
