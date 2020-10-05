package VL05_JAVAIO_Streams_Exceptions.A29;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
	
	public static void main(String[] args) {
		Angestellter a1 = new Angestellter(0,"Thomas","Dortmund",1500);
		Angestellter a2 = new Angestellter(1,"John","Essen",2500);
		
		schreiben(a1, new File("D:\\Test\\fileto.txt"));
	}
	
	//Outputstreams verwenden wenn datentyp = byte und nicht bei char
	public static void schreiben(Angestellter a, File f){
		try(OutputStream os = new FileOutputStream(f);
				OutputStreamWriter osw = new OutputStreamWriter(os)){
			osw.write(a.toString());
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//Sollte mit file/print writer sein, da es sich um "char-streams" handelt statt bytes
	public static void schreibenCharacter(Angestellter a, File f){
		try (FileWriter fw = new FileWriter(f);
				PrintWriter pw = new PrintWriter(fw)) {

			pw.format(a.toString());
			
			fw.flush();
			pw.flush();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
