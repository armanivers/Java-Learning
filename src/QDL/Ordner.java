package QDL;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ordner extends Eintrag{
	
	public List<Eintrag> kinder;
	
	public Ordner(String name) {
		super(name);
		kinder = new LinkedList<Eintrag>();
	}
	
	@Override
	public void print(int indent) {
		printWhitespaces(indent);
		System.out.println("[" + name +"]");
		for(Eintrag e : kinder) {
			e.print(indent+INDENT+1);
		}
	}
	
	@Override
	public void sort() {
		Collections.sort(kinder);
		for(Eintrag e:kinder) {
			e.sort();
		}
	}
		
	public void addKind(Eintrag e) {
		kinder.add(e);
	}
}
