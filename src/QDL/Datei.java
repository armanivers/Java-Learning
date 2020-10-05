package QDL;

public class Datei extends Eintrag{
	
	private String format;
	
	public Datei(String name,String format) {
		super(name);
		this.format = format;
	}
	
	@Override
	public void print(int indent) {
		printWhitespaces(indent);
		if(format.isEmpty()) {
			System.out.println(name);
		}else {
			System.out.println(name+"format");
		}
	}	
}
