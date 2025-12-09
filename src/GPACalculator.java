public class GPACalculator {

    public double calculate(Gradeable g) {
    	
        double[] grades = g.getGrades();
        if (grades == null||grades.length == 0 ) {
        	return 0.0;
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
