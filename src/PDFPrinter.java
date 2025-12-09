public class PDFPrinter implements ReportPrintable {

	@Override
	public void print(String name, double gpa) {
		// TODO Auto-generated method stub
		 System.out.println("Generated "+name+".pdf for student "+name+" with "+gpa);
	}
}
