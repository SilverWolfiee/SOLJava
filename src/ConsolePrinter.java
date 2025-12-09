public class ConsolePrinter implements ReportPrintable {

	@Override
	public void print(String name, double gpa) {
		// TODO Auto-generated method stub
		System.out.println("---- Student Report ----");
        System.out.println("Name: " + name);
        System.out.println("GPA : " + gpa);
		
	}

    
}
