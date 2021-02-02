package learn6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

import learn5.AverageStudentGrades;
import learn5.SubjectGrades;

public class Writer {
	public static void write(String fileName, Map<AverageStudentGrades, Set<SubjectGrades>> map) {		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
		for(AverageStudentGrades students : map.keySet()) {
			writer.write("==================================================\n");
			writer.write("Name: " + students.getStudentName() + ",  Grades: " + students.getAvarageGrade() + "\n");
			for(SubjectGrades grade : map.get(students)) {
				writer.write(grade.getSubject() + ": " + grade.getGrade() + "\n");
			}
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeObject(List<Student> students, String fileName) {
		try(ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
			for(Student student : students) {
				out.writeObject(student);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
			
	}
}

