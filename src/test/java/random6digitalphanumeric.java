import java.util.UUID;

public class random6digitalphanumeric {
	
	public static void main(String[] args) {
//		String random=UUID.randomUUID().toString();
		String random = UUID.randomUUID().fromString("abcdef").toString();
		System.out.println(random);
//		random = random.substring(0,6);
//		System.out.println(random);
		
		
	}
	

}
