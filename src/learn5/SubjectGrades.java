package learn5;

public class SubjectGrades {
	private final String subject;
	private final int grade;
	
	public SubjectGrades(String subject, int grade) {
		this.subject = subject;
		this.grade = grade;
	}

	public String getSubject() {
		return subject;
	}

	public int getGrade() {
		return grade;
	}
	
	public String toString() {
		return subject + ": " + grade;
	}
}
