package cs151.hw2.ex4_08;

import java.util.ArrayList;

/**
 * Test the Filter
 */
public class FilterTester {
	/*
	 * Filter the String
	 * @param a a String array to be filtered
	 * @return a String array been filtered
	 */
	public static String[] filter(String[] a, Filter f) {
		ArrayList<String> result = new ArrayList<String>();
		for (String element : a) {
			if (f.accept(element)) result.add(element);
		}
		
		String[] resultArray = new String[result.size()];
		result.toArray(resultArray);
		return resultArray;
	}
	
	public static void main(String args[]) {
		String[] a = {"a", "bc", "abcde", "jry", "acd"};
		Filter_NoMoreThanThreeChar f = new Filter_NoMoreThanThreeChar();
		
		String[] r = filter(a, f);
		
		System.out.println("The original String array is:");
		for (String e : a) 
			System.out.println(e);
		System.out.println();
		
		System.out.println("The filtered String array is:");
		for (String e : r) {
			System.out.println(e);
		}
	}

}
