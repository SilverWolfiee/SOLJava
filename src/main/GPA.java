package main;

public class GPA {
	public String calculateGPA(Student student) {
		if(!student.hasGrades()) {
			return "N/A";
		}
		double sum = 0;
		double[]grades = student.getGrades();
		for(double g : grades) {
			sum += g;
		}
		return String.format("%.2f", sum / grades.length);
	}
}
