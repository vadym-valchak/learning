package learn6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {
	public void read(String file) {
		String str;
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			while((str = reader.readLine()) != null) {
				System.out.println(str + "\n");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Student> readObject(String fileName){
		List<Student> students = new ArrayList<>();
		
		try(ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))){
			boolean keepreading = true;
			while(keepreading) {
				Student student = (Student) in.readObject();
				if(!"".equals(student.getName())) {
					students.add(student);
				} else {keepreading = false;}
			}
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return students;
	}
}
