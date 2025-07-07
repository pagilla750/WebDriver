import java.util.ArrayList;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,4,3,6,8,5};
		int temp;
				
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
			if(a[i]>a[j]) {
				//Swap
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}System.out.println(a[i]);
		}
	
	//swap the numbers with out temp variable
	int x=4;
	int y=5;
	
	x=x+y;
	y=x-y;
	x=x-y;
	
	System.out.println(x +"&"+ y);
	
	}
}


