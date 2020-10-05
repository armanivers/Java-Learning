package VL05_JAVAIO_Streams_Exceptions.WriterTests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		File f = new File("test.txt");
		List<String> l = new LinkedList<String>();
		for(int i = 0; i < 20; i++) {
			l.add(""+i);
		}
		drucke(l,f);
		drucke2(f,System.out);
	}
	
	public static void drucke(List<String> namen, File f) throws IllegalArgumentException {
		try(FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw)){
			namen.stream().sorted((a,b) -> a.compareTo(b)).forEach(n -> pw.print(n+", ")); //oder .println oder .format
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//outputstreamwriter braucth ein outputstream als argument -> autoclosable
	//bufferedWriter braucht ein Writer (z.b. filewriter,outputstreamwriter,printwrite) -> autoclosable
	//PrintWriter braucht File, OutputStream, Writer oder String -> autoclosable (z.B. printf)
	//FileWriter braucht File -> autoclosable
	public static void drucke2(File f, OutputStream output) {
		try(OutputStreamWriter oos = new OutputStreamWriter(output);
				BufferedWriter bw = new BufferedWriter(oos)){
			bw.write("Hallo");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
