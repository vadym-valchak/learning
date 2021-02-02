package learn6;

import learn5.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class IOMain {
	public static void main(String[] args) {
		String file = "students.bin";
		
		SortedMap<AverageStudentGrades, Set<SubjectGrades>> map = Main.create();
		Writer writer = new Writer();
		Reader reader = new Reader();
		
		processed(map, writer, file);
		showfile(reader, file);
	}
	
	private static void processed(SortedMap<AverageStudentGrades, Set<SubjectGrades>> map, Writer writer, String fileName) {
		List<Student> students = new ArrayList<>();
		for(AverageStudentGrades temp : map.keySet()) {
			students.add(new Student(temp.getStudentName(), temp.getAvarageGrade(), map.get(temp)));
		}
		students.add(new Student("", 0, new HashSet<>()));
		writer.writeObject(students, fileName);
	}
	
	private static void showfile(Reader reader, String fileName) {
		List<Student> students = reader.readObject(fileName);
		for(Student student : students) {
			System.out.println(student.getName() + "  " + student.getAvarageGrade() + student.getGrades());
		}
	}
}
