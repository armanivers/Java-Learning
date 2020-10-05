package VL06_Serialisierung_AnonymeKlassen.A33;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		File f = new File("D:\\Test\\kundenData.ser");
		Kunde testKunde = new Kunde("John");
		System.out.println(testKunde.toString() + testKunde.getKonto().toString() +" wurde serialisiert");
		serialisieren(testKunde,f);
		Kunde neu = deserialisieren(f);
		System.out.println(neu.toString() + neu.getKonto().toString() +" wurden deserialisiert");

	}
	
	public static void serialisieren (Kunde k,File f) {
		try (FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(k);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Kunde deserialisieren(File f) {
		Kunde k = null;
	
		try(FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			k = (Kunde) ois.readObject();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return k;
	}

}
