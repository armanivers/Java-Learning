import java.io.File;
import java.io.FileFilter;

public class PngFilter implements FileFilter{

	public PngFilter() {
		
	}
	
	@Override
	public boolean accept(File pathname) {
		if(pathname.getName().toLowerCase().endsWith(".png")){
			return true;
		}
		else {
			return false;
		}
	}

}
