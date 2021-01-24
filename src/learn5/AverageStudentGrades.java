package learn5;

public class AverageStudentGrades implements Comparable<AverageStudentGrades>{
	private final String studentName;
	private final float avarageGrade;
	
	public AverageStudentGrades(String studentName, float avarageGrade) {
		this.studentName = studentName;
		this.avarageGrade = avarageGrade;
	}

	public String getStudentName() {
		return studentName;
	}

	public float getAvarageGrade() {
		return avarageGrade;
	}
	
	@Override
	public String toString() {
		return studentName + ": " + avarageGrade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(avarageGrade);
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AverageStudentGrades other = (AverageStudentGrades) obj;
		if (Float.floatToIntBits(avarageGrade) != Float.floatToIntBits(other.avarageGrade))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(AverageStudentGrades o) {
		if(avarageGrade < o.avarageGrade) {
			return -1;
		}
		if(avarageGrade > o.avarageGrade) {
			return 1;
		}
		return studentName.compareTo(o.studentName);
	}
}
