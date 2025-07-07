
public class minimumNumberinMultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][]= {{6,4,5},{2,5,6},{8,3,3}};
		int min=abc[0][0];
		
		for(int i=0;i<abc.length;i++) {
			for(int j=0;j<abc.length;j++) {
				if(abc[i][j]<min) {
					min=abc[i][j];
				}
			}
		}System.out.println("minimum value in array is "+min);
		
		int[] a= {3,5,6,8,4,3,5,2,1};
		int common = 0;
		
		for(int i =0;i<a.length;i++) {
			for(int j =0;j<i;j++) {
				if(a[i]==a[j]) {
					common = a[i];
				}
			}System.out.println("common numbers"+common);
			
		}
		
	}

}
