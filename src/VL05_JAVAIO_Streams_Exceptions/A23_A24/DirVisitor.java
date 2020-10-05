package VL05_JAVAIO_Streams_Exceptions.A23_A24;

import java.io.File;

public interface DirVisitor {

	void enter(File f);
	void visitFile(File f);
	void exit(File f);
}
