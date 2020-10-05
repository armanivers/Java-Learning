package VL05_JAVAIO_Streams_Exceptions.A28;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		//Konsole
		sayHello(System.out);
		//Datei
		sayHello(new FileOutputStream(new File("D:\\Test\\fileto.txt")));
	}
	
	//A27 mit input/outputstream
	public static void sayHello(OutputStream s) {
		String t = "Hallo";
		try (OutputStreamWriter sw = new OutputStreamWriter(s)){
			sw.write(t.toCharArray());
			sw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
