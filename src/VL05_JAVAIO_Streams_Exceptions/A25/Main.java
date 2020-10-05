package VL05_JAVAIO_Streams_Exceptions.A25;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
	
	public static void main(String[] args) {
		copy(new File("D:\\Test\\filefrom.txt"), new File("D:\\Test\\fileto.txt"));
	}
	
	//Aufgabe 25 mit RandomAccessFile
	public static void copy(File from, File to) {
		RandomAccessFile raf_from = null;
		RandomAccessFile raf_to = null;
		try {
			raf_from = new RandomAccessFile(from, "r");
			raf_to = new RandomAccessFile(to, "rw");
			
			for(int i = 0 ; i < raf_from.length() ; i++) {
				raf_to.write(raf_from.read());
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//immer schliessen! (null pruefen und das schliessen (close) kann auch exception werfen!)
			try {
				if(raf_to!=null) {
					raf_to.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			try {
				if(raf_from!=null) {
					raf_from.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	//Aufgabe 25 mit RandomAccessFile und try with ressources
		public static void copyTryWithResources(File from, File to) {
			try (RandomAccessFile raf_from = new RandomAccessFile(from, "r");
					RandomAccessFile raf_to = new RandomAccessFile(to, "rw");){
				for(int i = 0 ; i < raf_from.length() ; i++) {
					raf_to.write(raf_from.read());
				}
			}catch(IOException e) {
				e.printStackTrace();
			}

		}
}

