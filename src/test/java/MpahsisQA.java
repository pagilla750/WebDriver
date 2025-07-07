import java.util.ArrayList;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MpahsisQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4) String a= ""I Love Java""
//				O/p Java Love I
		
		String a = "I Love Java";
		String b[] = a.split(" ");
		String c="";
		
		for(int i=b.length-1;i>=0; i--) {
			c += b[i]+" ";
		}
		System.out.println(c);
	
//		5) String a= ""I Love Java""
//				O/p avaJ evoL I

			
		
	}

}
