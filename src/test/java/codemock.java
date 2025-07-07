

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class codemock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	String str = "I Love India";
	System.out.println((str.replaceAll("(?i)i", " ")));
	
	String[] newstr = str.split(" ");
	for(int i=0;i<newstr.length;i++) {
		System.out.println(newstr[i]);
		}
	
	//List to Array
	List<Integer> lst = new ArrayList<Integer>(Arrays.asList(1,2,3));
	Object[] arr = lst.toArray();
	System.out.println(arr[0]);
	
	//Array to List method1
	int[] arr1 = {1,2,3};
	lst = new ArrayList<Integer>();  
	for(int num:arr1) {
		lst.add(num);		
	}
	System.out.println(lst);
	
	//Array to List method2
	Integer[] arr11 = {1,2,3};
	List<Integer> lst1 = Arrays.asList(arr11);
	System.out.println(lst1);
	
	//display part of string
	String str1 = "abc";
	String[] strarr = str1.split("c");
	System.out.println(strarr[0]);
	
	System.out.println(str1.substring(0, 2));
	
	//String mutable
	String immutabelStr ="immutable";
	System.out.println(immutabelStr.replace(immutabelStr, str1));
	
	
	
	
	
	}

}
