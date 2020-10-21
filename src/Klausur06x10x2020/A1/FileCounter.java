package Klausur06x10x2020.A1;

public class FileCounter implemente DirVisitor{
	
	private int anzahlD;
	private int anzhalF;
	
	public FileCounter() {
		anzahlD = 0;
		anzahlF = 0;
	}
	
	public void enter(File f) {
		
	}
	public void enterFile(File f) {
		
	}
	
	public int countF() {
		return anzahlF;
	}
	
	public int countD() {
		return anzahlD;
	}
}
