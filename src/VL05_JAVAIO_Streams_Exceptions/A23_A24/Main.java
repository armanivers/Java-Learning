package VL05_JAVAIO_Streams_Exceptions.A23_A24;

import java.io.File;
import java.io.FileFilter;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\arman\\OneDrive - Fachhochschule Dortmund\\!Semester 4\\Programmierkurs 1");
		
		//Aufgabe 23
		FileTree ft = new FileTree(new DirPrinter());
		//ft.traverse(file);
		//Aufgabe 24
		ft.traverseFiltered(file,new PdfFilter());

		ft.traverseFiltered(file,e -> {
			return e.getName().toLowerCase().endsWith(".pdf");
		});
		
		ft.traverseFiltered(file,new FileFilter() {
			public boolean accept(File pathname) {
				if(pathname.getName().toLowerCase().endsWith(".pdf")) {
					return true;
				}
				return false;
			}
		});
	}
}
