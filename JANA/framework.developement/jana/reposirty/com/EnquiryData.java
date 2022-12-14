package jana.reposirty.com;

import jana.utility.com.ReadExcelDemo;

public interface EnquiryData {
	
	int col =0;
	int sh =0;

	ReadExcelDemo rd = new ReadExcelDemo();
	
	String ssc = "General Info about CASA FD";
	String multissc = rd.runMultiData(0);
	
}
