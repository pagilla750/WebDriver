
public class fibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int firstnum = 0;
		int secnum = 1;
		
		for(int i=1;i<=n; ++i) {			
			int sum = firstnum+secnum;
			System.out.print(sum+",");
			firstnum = secnum;
			secnum = sum;	
		}
		
		prime(21);
	}

	

	private static void prime(int val) {
		// TODO Auto-generated method stub
			boolean flag = false;
			for (int i=2;i<=val/2;i++) {
				if(val%i==0) {
					flag = true;
					break;
				}
			}
				
				if(flag) {
					System.out.println(val+" is NOT a prime number");
				}else {
					System.out.println(val+" is a prime number");
				}			
		}
		
}
