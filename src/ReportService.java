public class ReportService {
    private final ReportPrintable printer;

    public ReportService(ReportPrintable printer) {
        this.printer = printer;
    }

    public void generateReport(GradedStudent s, double gpa) {
        printer.print(s.getName(), gpa);
    }
}
