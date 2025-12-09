
public class GradedStudent extends Student implements Gradeable{
	private double[] grades;
	public GradedStudent(String name, double[]grades) {
		super(name);
		this.grades = grades;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double[] getGrades() {
		// TODO Auto-generated method stub
		return grades;
	}

}
