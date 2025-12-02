package main;

public class Regularstudent extends Student {
	private double[]grades;
	public Regularstudent(String name, double[]grades) {
		super(name);
		this.grades = grades;
		
	}
	@Override
	public boolean hasGrades() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double[] getGrades() {
		// TODO Auto-generated method stub
		return grades;
	}

}
