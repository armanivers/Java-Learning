package firma;

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

}
