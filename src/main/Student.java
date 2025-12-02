package main;

public abstract class Student {
    protected String name;

	public Student(String name) {
		this.name  = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    public abstract boolean hasGrades();
    public abstract double[] getGrades();
}
