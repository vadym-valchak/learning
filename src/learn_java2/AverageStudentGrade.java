package learn_java2;

public class AverageStudentGrade implements Comparable<AverageStudentGrade>{

	private final String name;
	private final float averageGrade;
	
	public AverageStudentGrade(String name, float averegeGrade) {
		this.name = name;
		this.averageGrade = averegeGrade;
	}
	
	public String getName() {
		return name;
	}

	public float getAveregeGrade() {
		return averageGrade;
	}

	public int compareTo(AverageStudentGrade that) {
		if(this.averageGrade < that.getAveregeGrade()) {
			return -1;
		} else if(this.averageGrade > that.getAveregeGrade()) {
			return 1;
		}
		return this.name.compareTo(that.name);
	}
	
	@Override
	public String toString() {
		return "Students name: " + name + " Grade: " + averageGrade;
	}
}
