package VL05_JAVAIO_Streams_Exceptions.A23_A24;

import java.io.File;
import java.io.FileFilter;

public class PdfFilter implements FileFilter{
	
	public PdfFilter() {
		
	}
	
	@Override
	public boolean accept(File pathname) {
		if(pathname.getName().toLowerCase().endsWith(".pdf")) {
			return true;
		}
		return false;
	}
}
