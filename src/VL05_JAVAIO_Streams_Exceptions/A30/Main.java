package VL05_JAVAIO_Streams_Exceptions.A30;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/Test/fileto.txt");
		uppercaseTest("Das ist ein test!",file);
	}
	
	public static void uppercaseTest(String s, File f) throws IOException {
		try(FileWriter fw = new FileWriter(f);
				UpperCaseWriter ucw = new UpperCaseWriter(fw)){
			ucw.write(s);
		}
	}
}
