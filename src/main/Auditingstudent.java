package main;

public class Auditingstudent extends Student{
	public Auditingstudent(String name) {
		super(name+"(Guest)");
		
		
	}
	@Override
	public boolean hasGrades() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double[] getGrades() {
		// TODO Auto-generated method stub
		return null;
	}

}
