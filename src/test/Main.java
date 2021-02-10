package test;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File file = new File("D:\\doc\\temp.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		
	}
}
