package learn4;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] tokens = str.split(" ");
		for(String token : tokens) {
			String word = token.toLowerCase();
			Integer count = map.get(word);
			if(count == null) {
				map.put(word, 1);
			} else {
				count = map.get(word);
				map.put(word, ++count);
			}
		}
		
		NavigableSet<WordWrapper> covered = covere(map);
		print(covered);
		
	}
	
	public static NavigableSet<WordWrapper> covere(Map<String, Integer> map) {
		NavigableSet<WordWrapper> set = new TreeSet<>();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			set.add(new WordWrapper(entry.getKey(), entry.getValue()));
		}
		return new TreeSet<>(set);
	}
	
	public static void print(NavigableSet<WordWrapper> ob) {
		for(WordWrapper word : ob) {
			System.out.println(word.getWord() + " " + word.getCount());
		}
	}
	
}
