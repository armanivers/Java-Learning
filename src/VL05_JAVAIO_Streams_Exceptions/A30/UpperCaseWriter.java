package VL05_JAVAIO_Streams_Exceptions.A30;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class UpperCaseWriter extends FilterWriter{

	public UpperCaseWriter(Writer out) {
		super(out);
	}
	
	@Override
	public void write(int c) throws IOException {
		super.write(Character.toUpperCase(c));
	}
	
	@Override
	public void write(char[] c, int off, int len) throws IOException {
		for(int i = off; i < len ; i++) {
			write(c[i]);
		}
	}
	
	@Override
	public void write(String s, int off, int len) throws IOException {
		char[] c = s.toCharArray();
		for(int i = off; i < len ; i++) {
			write(c[i]);
		}
	}
}
