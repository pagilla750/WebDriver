
public class separatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input="dsafdskalf12123132ewjaieuriew&^$%^&13923478";
		 
		 String letters ="";
		 String digits = "";
		 String specials = "";
		 
		 for(int i=0; i<input.length();i++) {
			 char ch = input.charAt(i);
					 if(Character.isLetter(ch)){
						 letters += ch;
					 }else if(Character.isDigit(ch)){
						 digits +=ch;
					 }else {
						 specials +=ch;
					 }
		 }System.out.println(letters+"---"+digits+"---"+specials);
		 
		 
	}

}
