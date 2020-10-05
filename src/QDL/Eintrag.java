package QDL;

public abstract class Eintrag implements Comparable<Eintrag>{
	public static final int INDENT = 5;
	protected String name;
	
	public Eintrag(String name) {
		this.name = name;
	}
	
	public void print() {
		print(0);
	}
	
	protected abstract void print(int indent);
	
	protected void printWhitespaces( int indent ) {
		while ( indent-- > INDENT )
			System.out.print( ' ' );
		
		if ( indent > 0 ) {
			System.out.print( "|" );
			
			for ( int i = 0; i < INDENT - 2; i++ )
				System.out.print( '-' );
			
			System.out.print( ' ' );
		}
	}
	
	protected void sort() {}
	
	@Override 
	public int compareTo( Eintrag e) {
		return name.compareTo( e.name );
	}
}
