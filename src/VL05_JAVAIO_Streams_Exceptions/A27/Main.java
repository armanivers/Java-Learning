package VL05_JAVAIO_Streams_Exceptions.A27;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
	public static void main(String[] args) {
		//copy(new File("D:\\Test\\filefrom.txt"), new File("D:\\Test\\fileto.txt"));
		copyBuffered(new File("D:\\Test\\filefrom.txt"), new File("D:\\Test\\fileto.txt"));
	}
	
	//A27 mit input/outputstream
	public static void copy(File from, File to) {
		try (InputStream in = new FileInputStream(from);
				BufferedInputStream bufferIn = new BufferedInputStream(in);
				OutputStream out = new FileOutputStream(to);
				OutputStream bufferOut = new BufferedOutputStream(out)){
			int c;
			while((c=bufferIn.read()) != -1) {
				bufferOut.write(c);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//A27 mit input/outputstream mit Buffer
		public static void copyBuffered(File from, File to) {
			try (InputStream in = new FileInputStream(from);
					OutputStream out = new FileOutputStream(to)){
				int c;
				while((c=in.read()) != -1) {
					out.write(c);
				}
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
}
