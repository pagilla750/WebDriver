import java.util.ArrayList;

public class uniqueNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,5,6,6,7,8,4,5,5,8,9};
		
		ArrayList<Integer> al = new ArrayList();
		
		for(int i=0;i<arr.length;i++) {
			int k =0;
			if(!al.contains(arr[i])) {
				
				al.add(arr[i]);
				k++;
				
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						k++;
					}
				}
			}
			if (k==1)
				System.out.println("unique number is "+arr[i]);
		}
		

	}

}
