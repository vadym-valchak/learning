package learn5;

import java.util.HashSet;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;


public class Main {
	public static void main(String[] args) {
		NavigableMap<AverageStudentGrades, Set<SubjectGrades>> map = new TreeMap<>(create());
		printStudent(map, true);
	}
	
	public static NavigableMap<AverageStudentGrades, Set<SubjectGrades>> create(){
		Set<SubjectGrades> alexGrades = new HashSet<>();
		alexGrades.add(new SubjectGrades("Mathematics", 89));
		alexGrades.add(new SubjectGrades("Physics", 65));
		alexGrades.add(new SubjectGrades("History", 95));
		alexGrades.add(new SubjectGrades("Literature", 90));
		alexGrades.add(new SubjectGrades("Chemistry", 75));

		Set<SubjectGrades> jamesGrades = new HashSet<>();
		jamesGrades.add(new SubjectGrades("Mathematics", 75));
		jamesGrades.add(new SubjectGrades("Physics", 80));
		jamesGrades.add(new SubjectGrades("History", 55));
		jamesGrades.add(new SubjectGrades("Literature", 70));
		jamesGrades.add(new SubjectGrades("Chemistry", 80));
		
		Set<SubjectGrades> antonyGrades = new HashSet<>();
		antonyGrades.add(new SubjectGrades("Mathematics", 93));
		antonyGrades.add(new SubjectGrades("Physics", 91));
		antonyGrades.add(new SubjectGrades("History", 82));
		antonyGrades.add(new SubjectGrades("Literature", 78));
		antonyGrades.add(new SubjectGrades("Chemistry", 88));
		
		Set<SubjectGrades> victoriaGrades = new HashSet<>();
		victoriaGrades.add(new SubjectGrades("Mathematics", 73));
		victoriaGrades.add(new SubjectGrades("Physics", 65));
		victoriaGrades.add(new SubjectGrades("History", 75));
		victoriaGrades.add(new SubjectGrades("Literature", 66));
		victoriaGrades.add(new SubjectGrades("Chemistry", 50));
		
		NavigableMap<AverageStudentGrades, Set<SubjectGrades>> map = new TreeMap<>();
		map.put(new AverageStudentGrades("Alex", getAvarageGrade(alexGrades)), alexGrades);
		map.put(new AverageStudentGrades("James", getAvarageGrade(jamesGrades)), jamesGrades);
		map.put(new AverageStudentGrades("Antony", getAvarageGrade(antonyGrades)), antonyGrades);
		map.put(new AverageStudentGrades("Victoria", getAvarageGrade(victoriaGrades)), victoriaGrades);
		
		return map;
	}
	
	public static float getAvarageGrade(Set<SubjectGrades> subjectGrade) {
		float avarageGrade = 0.0f;
		int count = 0;
		for(SubjectGrades subject : subjectGrade) {
			avarageGrade = avarageGrade + subject.getGrade();
			count++;
		}
		return avarageGrade / count;
	}
	
	public static void printStudent(NavigableMap<AverageStudentGrades, Set<SubjectGrades>> map, boolean subjectGrades) {
		for(Map.Entry<AverageStudentGrades, Set<SubjectGrades>> student : map.entrySet()) {
			System.out.println(student.getKey());
			if(subjectGrades == true) {
				System.out.println(student.getValue());
			}
		}
	}
}
