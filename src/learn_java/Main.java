package learn_java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<Car> sixCars =  new HashSet<>();
		sixCars.add(new Car("VW", "Golf", 45));
		sixCars.add(new Car("Audi", "A3", 60));
		sixCars.add(new Car("VW", "Polo", 25));
		sixCars.add(new Car("BMW", "Z4", 120));
		sixCars.add(new Car("BMW", "440i", 200));
		
		Set<Car> europaCars = new HashSet<>();
		europaCars.add(new Car("Toyota", "Auris", 40));
		europaCars.add(new Car("Reno", "Clio", 30));
		europaCars.add(new Car("Reno", "Megan", 50));
		europaCars.add(new Car("VM", "Golf", 45));
		europaCars.add(new Car("VM", "Polo", 35));
		
		Set<Car> uniqueCars = new TreeSet<>(sixCars);
		uniqueCars.addAll(europaCars);
		
		print(uniqueCars);
		
	}
	
	public static void print(Set<Car> cars) {
		System.out.printf("%-20s %-20s %-20s\n", "Car brand", "Model", "Price per day");
		for(Car car : cars) {
			System.out.printf("%-20s %-20s %-20s\n", car.getCarBrand(), car.getModel(), car.getPricePerDay());
		}
	}
}