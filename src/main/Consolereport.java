package main;

public class Consolereport implements Report {

	@Override
	public void print(String name, String gpa) {
		// TODO Auto-generated method stub
		if (gpa.equals("N/A")) {
	        System.out.println("Guest student detected — console export skipped.\n");
	        System.out.println("Guest : "+name);
	        return;
	    }
		System.out.println("=====Report======");
		System.out.println("=================");
		System.out.println("Student : "+name);
		System.out.println("GPA : "+gpa);
		System.out.println("================");
		System.out.println(" ");
	}

}
