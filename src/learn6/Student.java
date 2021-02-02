package learn6;

import learn5.SubjectGrades;

import java.io.Serializable;
import java.util.Set;

public class Student implements Serializable{
	private String name;
	private float avarageGrade;
	private Set<SubjectGrades> grades;

	public Student(String name, float avarageGrade, Set<SubjectGrades> grades) {
		this.name = name;
		this.avarageGrade = avarageGrade;
		this.grades = grades;
	}

	public String getName() {
		return name;
	}

	public float getAvarageGrade() {
		return avarageGrade;
	}

	public Set<SubjectGrades> getGrades() {
		return grades;
	}
}
