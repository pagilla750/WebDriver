import java.util.ArrayList;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "madama";
		String revstr="";
		for(int i=str.length()-1;i>=0;i--) {
			revstr += str.charAt(i);		
		}
		
		if(str.equals(revstr)) {
			System.out.println("Is palyndrom");
		}else {
			System.out.println("Is not a polyndrom");
		}
	}

}
