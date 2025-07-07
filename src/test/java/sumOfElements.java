import java.util.Scanner;

public class sumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,3,5,6};
		int sum = sumArray(a);
		System.out.println("Sum of all elements is "+sum);		
		
		int result = multiply(5,10);
		System.out.println("Multiply of number "+result);
	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
//		int multiply = i*j; //one way
		int k =1;
		int sum=0;
		while (k<=j)
		{
			sum +=i;			
			k++;
		}
		
		return sum;
	}

	private static int sumArray(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0; i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	
}
