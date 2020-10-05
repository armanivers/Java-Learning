package VL06_Serialisierung_AnonymeKlassen.A32;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;

public class Main {

	public static void main(String[] args) {

		try {
			serialisieren();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		deserialisieren();
	}

	public static void serialisieren() throws FileNotFoundException {
		A a = new A("Testklasse", new RandomAccessFile(new File("test.txt"), "rw"));
		File sfile = new File("/Users/dwiesmann/IO/a.ser");
		try (FileOutputStream fos = new FileOutputStream(sfile); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(a);
		} catch (IOException e) {
			System.out.println("Fehler bei der Serialisierung");
			// TODO Ausnahmebehandlung
		}
	}

	public static void deserialisieren() {
		File sfile = new File("/Users/dwiesmann/IO/a.ser");
		A a = null;
		try (FileInputStream fis = new FileInputStream(sfile); ObjectInputStream ois = new ObjectInputStream(fis)) {
			a = (A) ois.readObject();
		} catch (IOException e) {
			System.out.println("IO-Fehler bei der Deserialisierung");
			// TODO Ausnahmebehandlung
		} catch (ClassNotFoundException e) {
			System.out.println("Fehler: class-Datei nicht gefunden");
			// TODO Ausnahmebehandlung
		}
	}

}
