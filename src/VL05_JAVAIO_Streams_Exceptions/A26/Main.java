package VL05_JAVAIO_Streams_Exceptions.A26;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

	public static void main(String[] args) {
		catAlternative(new File("D:\\Test\\filefrom.txt"));
	}

	// Aufgabe 26 try with ressources (meine Loesung, da kommen "null" am Ende)
	public static void cat(File quelle) {
		try (RandomAccessFile from = new RandomAccessFile(quelle, "r");) {
			for (int i = 0; i < from.length(); i++) {
				System.out.println(from.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	//bessere Variante mit while Schleife
	public static void catAlternative(File quelle) {
		try (RandomAccessFile from = new RandomAccessFile(quelle, "r");) {
			int c;
			while((c=from.read() )!= -1) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}