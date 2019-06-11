package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int length = eggs.size();
		int rt = 0;
		for (int i = 0; i < length; i++) {
			if (eggs.get(i).equals("cracked")) {
				rt = i;
				break;
			} else {
				rt = -1;
			}
		}
		return rt;
		
	}
	public static int countPearls(List<Boolean> oys) {
		int length = oys.size();
		int rt = 0;
		for (int i = 0; i < length; i++) {
			if (oys.get(i).equals(true)) {
				rt++;
			}
		}
		return rt;
	}
	
	public static double findTallest(List<Double> h) {
		int length = h.size();
		Double tallest = 0.0;
		for (int i = 0; i < length-1; i++) {
			if(h.get(i) < h.get(i+1)) {
				tallest = h.get(i+1);
			}
		}
		return tallest;
		
	}
	
	public static boolean containsSOS(List<String> s) {
		int length = s.size();
		boolean rt = true;
		for (int i = 0; i < length; i++) {
			if(s.get(i).contains("... --- ...")) {
				rt = true;
				break;
			}
			else {
				rt = false;
			}
		}
		return rt;
	
	}
	
	public static String findLongestWord(List<String> m) {
		int length = m.size();
		String longest = "";
		for (int i = 0; i < length; i++) {
			if(m.get(i).length() > longest.length()) {
				longest = m.get(i);
			}
		}
		return longest;
	}
	
	public static void sortScores(List<Double> d) {
		for (int i = 0; i < d.size(); i++) {
			for (int j = 0; j < d.size(); j++) {
				if(d.get(i) < d.get(j)) {
					Double switcheroo = d.get(i);
					d.set(i, d.get(j));
					d.set(j, switcheroo);
				}
			}
		}
		
	}
	
}
