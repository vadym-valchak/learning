package learn3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {

		NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = createGrades();
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter("grandBook.txt");
			for (AverageStudentGrade gradeKey : grades.keySet()) {
				writer.write("==========================\n");
				writer.write("Students: " + gradeKey.getName() + "Average grade" + gradeKey.getAveregeGrade() + "\n");

				for (SubjectGrade grade : grades.get(gradeKey)) {
					writer.write("Subject " + grade.getSubject() + "Grade: " + grade.getGrade() + "\n");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void printGrades(Map<AverageStudentGrade, Set<SubjectGrade>> grades, boolean printValue) {
		Set<AverageStudentGrade> averageGrades = grades.keySet();
		for (AverageStudentGrade gr : averageGrades) {
			System.out.println(gr);
			if (printValue) {
				System.out.println(grades.get(gr));
			}
		}
	}

	public static NavigableMap<AverageStudentGrade, Set<SubjectGrade>> createGrades() {
		Set<SubjectGrade> alexGrades = new HashSet<>();
		alexGrades.add(new SubjectGrade("Mathematics", 89));
		alexGrades.add(new SubjectGrade("Physics", 65));
		alexGrades.add(new SubjectGrade("History", 95));
		alexGrades.add(new SubjectGrade("Literature", 90));
		alexGrades.add(new SubjectGrade("Chemistry", 75));

		Set<SubjectGrade> jamesGrades = new HashSet<>();
		jamesGrades.add(new SubjectGrade("Mathematics", 75));
		jamesGrades.add(new SubjectGrade("Physics", 80));
		jamesGrades.add(new SubjectGrade("History", 55));
		jamesGrades.add(new SubjectGrade("Literature", 70));
		jamesGrades.add(new SubjectGrade("Chemistry", 80));

		Set<SubjectGrade> antonyGrades = new HashSet<>();
		antonyGrades.add(new SubjectGrade("Mathematics", 93));
		antonyGrades.add(new SubjectGrade("Physics", 91));
		antonyGrades.add(new SubjectGrade("History", 82));
		antonyGrades.add(new SubjectGrade("Literature", 78));
		antonyGrades.add(new SubjectGrade("Chemistry", 88));

		Set<SubjectGrade> victoriaGrades = new HashSet<>();
		victoriaGrades.add(new SubjectGrade("Mathematics", 73));
		victoriaGrades.add(new SubjectGrade("Physics", 65));
		victoriaGrades.add(new SubjectGrade("History", 75));
		victoriaGrades.add(new SubjectGrade("Literature", 66));
		victoriaGrades.add(new SubjectGrade("Chemistry", 50));

		NavigableMap<AverageStudentGrade, Set<SubjectGrade>> map = new TreeMap<>();
		map.put(new AverageStudentGrade("Alex", calcAverage(alexGrades)), alexGrades);
		map.put(new AverageStudentGrade("James", calcAverage(jamesGrades)), jamesGrades);
		map.put(new AverageStudentGrade("Antony", calcAverage(antonyGrades)), antonyGrades);
		map.put(new AverageStudentGrade("Victoria", calcAverage(victoriaGrades)), victoriaGrades);

		return map;
	}

	private static float calcAverage(Set<SubjectGrade> grades) {
		float sum = 0f;
		for (SubjectGrade sg : grades) {
			sum += sg.getGrade();
		}
		return sum / grades.size();
	}

}
