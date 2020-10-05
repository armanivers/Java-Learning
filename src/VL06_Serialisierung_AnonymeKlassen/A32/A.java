package VL06_Serialisierung_AnonymeKlassen.A32;

import java.io.RandomAccessFile;
import java.io.Serializable;

public class A implements Serializable {
	private String name;
	//transiente Attribute werden nicht serialisiert
	private transient RandomAccessFile raf;
	//statische Attribute werden nicht serialisiert
	protected static int id;

	public A(String name, RandomAccessFile raf) {
		this.name = name;
		this.raf = raf;
		id = 0;
	}
}