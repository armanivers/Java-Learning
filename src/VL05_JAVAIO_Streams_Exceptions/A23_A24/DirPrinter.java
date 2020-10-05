package VL05_JAVAIO_Streams_Exceptions.A23_A24;

import java.io.File;

public class DirPrinter implements DirVisitor{

	String platzhalter;
	
	public DirPrinter() {
		platzhalter = "";
	}
	
	@Override
	public void enter(File f) {
		System.out.printf("%s[%s]%n", platzhalter, f.getName());
		platzhalter = platzhalter + "   ";
	}

	@Override
	public void visitFile(File f) {
		System.out.printf("%s%s%n", platzhalter ,f.getName());
	}

	@Override
	public void exit(File f) {
		platzhalter = platzhalter.substring(3);
	}

}
