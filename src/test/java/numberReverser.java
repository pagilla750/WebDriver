
public class numberReverser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberreverse(5412123);
	}

	private static void numberreverse(int i) {
		// TODO Auto-generated method stub
		int reversenumber = 0;
		int originalnumber = i;
		
		while(i!=0) {
			int digit = i%10;
			reversenumber = reversenumber*10+digit;
			i = i/10;
		}
		System.out.println(originalnumber);
		System.out.println(reversenumber);
	}
}	
	

