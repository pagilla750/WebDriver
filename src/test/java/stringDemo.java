import java.util.Scanner;

public class stringDemo {
	
	public static void main (String[] args) {
		
		String Input = "I love java programming";
		
		String[] input = Input.split(" ");
		String initialstring = "";
		StringBuilder reversed = new StringBuilder();
		
		for(int i=0;i<input.length;i++) {
			if(input[i].equals("programming")) {
				for(int j=input[i].length()-1;j>=0;j--)
				{
//					reversestring = reversestring + input[i].charAt(j);
					reversed.append(input[i].charAt(j));
				}
			}else
			initialstring = initialstring +" "+ input[i]; 
			
		}System.out.println(initialstring +" "+reversed);
		
	
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		// Call the transformation method
		String transformedString = transformString(inputString);

		System.out.println("Original String: " + inputString);
		System.out.println("Transformed String: " + transformedString);

    // Close the scanner to release system resources
    scanner.close();
	}
		
		public static String transformString(String in) {
			
			StringBuilder resultbuilder = new StringBuilder();
			
			for(char ch : in.toCharArray()) {
				if(ch=='o') {
					resultbuilder.append(3);
				}else if(ch=='r') {
					resultbuilder.append(2);
				}else {
					resultbuilder.append(ch);
				}
			} return resultbuilder.toString();
		}
	}


