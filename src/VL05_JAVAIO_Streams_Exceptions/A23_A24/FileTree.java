package VL05_JAVAIO_Streams_Exceptions.A23_A24;

import java.io.File;
import java.io.FileFilter;

public class FileTree{

	DirVisitor dv;
	
	public FileTree(DirVisitor dv) {
		this.dv = dv;
	}
	
	public void traverse(File dir) {
		if(dir.isDirectory()) {
			dv.enter(dir);
			File[] list = dir.listFiles();
			for(File file: list) {
				if(file.isFile()) {
					dv.visitFile(file);
				}else {
					traverse(file);
				}
			}
			dv.exit(dir);
		}
	}
	
	public void traverseFiltered(File dir,FileFilter filter) {
		if(dir.isDirectory()) {
			dv.enter(dir);
			File[] list = dir.listFiles(filter);
			for(File file: list) {
				if(file.isFile()) {
					dv.visitFile(file);
				}else {
					traverse(file);
				}
			}
			dv.exit(dir);
		}
	}
}
