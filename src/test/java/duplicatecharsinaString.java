import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicatecharsinaString {

//	public static String findduplicatecahrsinaStrig(String str) {
//		ArrayList arr = new ArrayList<>();
//		for(int i=0;i<str.length();i++) {
//			for(int j=i+1;j<=str.length()-1;j++) {
//				if(str.charAt(i)==str.charAt(j)) {
//					arr.add(str.charAt(i));	
//					}
//			}
//		} return arr.toString();
//		
//	}
	
	//using hashset method
	/**
	 * @param str
	 */
	public static void findduplicatecahrsinaStrig(String str) {
		Set<Character> uniquechars = new HashSet<>();
		Set<Character> duplicatechars = new HashSet<>();
		
		for(char c : str.toCharArray()) {
			if(!uniquechars.add(c)) {
				duplicatechars.add(c);
			}
		}
		
		if(duplicatechars.isEmpty()) {
			System.out.println("No duplicates found");
		}else {
			for(char c:duplicatechars) {
				System.out.print(c+" ");
			}
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			findduplicatecahrsinaStrig("liril");
		}

}
