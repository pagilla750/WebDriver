import java.util.ArrayList;

public class removeDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,8,2,3,4};
		ArrayList<Integer> uniquelist = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			boolean isDuplicate = false;
			
			for(int j=0;j<uniquelist.size();j++) {
			if(uniquelist.get(j)==arr[i]) {
				isDuplicate=true;
				break;				
			}
		}
			if(!isDuplicate) {
				uniquelist.add(arr[i]);
			}
	}System.out.println(uniquelist);

	}

}
