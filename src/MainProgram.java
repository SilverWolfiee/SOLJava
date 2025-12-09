// --- Main Execution ---
//NIM : 2802393756
//discord.gg/reversedrooms
import java.util.*;

public class MainProgram {
	public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Graded student name");
        System.out.print(">> ");
        String Graded = sc.nextLine();
        System.out.println("Guest student name");
        System.out.print(">> ");
        String guest = sc.nextLine();
        //write another of your name scanner here
        validateAfterFix(Graded, guest);
        
//        validateBeforeFix("a","b");
        
    }
    
//    private static void validateBeforeFix(String gradedName, String guestName) {
//    	System.out.println("~~ Before SOLID Fixes ~~");
//        // Scenario 1: Standard Student
//        Student a = new Student(gradedName, new double[]{3.5, 4.0, 3.8});
//        a.printReport("CONSOLE");
//
//        // Scenario 2: Guest Student (The Crash)
//        Student b = new GuestStudent(guestName);
//        try {
//            // This will CRASH the program because b violates LSP
//            b.printReport("CONSOLE"); 
//        } catch (UnsupportedOperationException e) {
//            System.out.println("CRASH! Error processing Bob: " + e.getMessage());
//        }
//    }
    
    private static void validateAfterFix(String gradedName, String guestName) { 
    	System.out.println("~~ After SOLID Fixes ~~");   	

        // Setup Data
        GradedStudent a = new GradedStudent(gradedName, new double[]{3.5, 4.0, 3.8});
        GuestStudent b = new GuestStudent(guestName);

        // Logic Calculation
        GPACalculator calculator = new GPACalculator();
        double aGpa = calculator.calculate(a);
        
        // NOTE: The compiler prevents us from calculating Bob's GPA:
        // calculator.calculate(b); // Compile Error! Safe!

        // Report Generation (DIP & OCP in action)
        
        // 1. Console Report
        ReportService consoleService = new ReportService(new ConsolePrinter());
        consoleService.generateReport(a, aGpa);

        // 2. PDF Report (Easy switch!)
        ReportService pdfService = new ReportService(new PDFPrinter());
        pdfService.generateReport(a, aGpa);
        
        // 3. Guest Report (Handled safely without crashing)
        System.out.println("Guest Check-in: " + b.getName());
    }

}
