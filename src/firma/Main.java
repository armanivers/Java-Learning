package firma;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String args[]) throws IOException {
		Angestellter a = new Angestellter("Neuer Angestellter", 1000);

		File file = new File("D:/Test/fileto.txt");

		//in der Methode IOException? Nicht nur in der Methode wo die exception kommen kann?
		//schreiben(a, file);
		uppercaseTest(a,file);
	}

	public static void schreiben(Angestellter a, File f) throws IOException {

		try (FileWriter fw = new FileWriter(f);
				PrintWriter pw = new PrintWriter(fw)) {

			pw.format("Name: %s %nGehalt: %d",a.name,a.gehalt);
			
			fw.flush();
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void uppercaseTest(Angestellter a, File f) throws IOException {
		try(FileWriter fw = new FileWriter(f);
				UpperCaseWriter ucw = new UpperCaseWriter(fw)){
			ucw.write(a.name+" " +a.gehalt);
		}
	}
}