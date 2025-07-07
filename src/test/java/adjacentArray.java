import java.util.ArrayList;

public class adjacentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//max difference between any adjacent index in array
		int[] a = {1,4,8,15,17}; //3, 4, 7, 2
		int diff=0;
		for(int i=0;i<a.length-1;i++) 
		{
			if(a[i+1]-a[i]>diff)
			{
				diff = a[i+1]-a[i];
			}
		}
		System.out.println("max differenece is :"+diff);
	
		//compare two index of 2 different arrays and create a common elements array
		int b[] = {1,4,5,7};
		int c[] = {6,4,7,3};
		ArrayList<Integer> commonlist = new ArrayList<>();
		
		for(int i=0;i<b.length;i++) {
				for(int j=0;j<c.length;j++) {
					if(b[i]==c[j]) {
						commonlist.add(b[i]);
					}
				}
			} 
//		Object[] comm = commonlist.toArray();
		System.out.println("comman array"+commonlist);
		
	}	
}
