package main;

public class Excelreport implements Report{

	@Override
	public void print(String name, String gpa) {
	    if (gpa.equals("N/A")) {
	        System.out.println("Guest student detected — Excel export skipped.\n");
	        System.out.println("Guest : "+name);
	        return;
	    }

	    System.out.println("Output has been exported to " + name + ".xlsx");
	    System.out.println("=====Report======");
	    System.out.println("=================");
	    System.out.println("Student : " + name);
	    System.out.println("GPA : " + gpa);
	    System.out.println("================");
	}


}
