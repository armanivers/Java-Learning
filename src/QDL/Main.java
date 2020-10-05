package QDL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
private static final String pathStore = "path.txt";
	
	public static void main( String[] args ) throws UnknownPathException {
		@SuppressWarnings( "resource" )
		Scanner s = new Scanner( System.in );
		String path = s.nextLine();
		
		if ( path.isEmpty() ) {
			path = readPath();
			
			if ( path.isEmpty() )
				throw new UnknownPathException("Ungueltiger Name");
				return;
		} else
			storePath( path );
		
		File file = new File( path );
		
		Eintrag root = buildFileTree( file, new FileFilter() {
			@Override
			public boolean accept( File pathname ) {
				return pathname.isDirectory() || pathname.getName().endsWith( ".jpg" );
			}
		} );
		
		if ( root != null )
			root.print();
	}
	
	public static Eintrag buildFileTree( File file, FileFilter filter ) {
		if ( !file.exists() )
			return null;
		
		if ( file.isFile() )
			return new Ordner( file.getName() );
		else if ( file.isDirectory() ) {
			Ordner folder = new Ordner( file.getName() );
			
			File[] children = file.listFiles( filter );

			if ( children != null )
				for ( File child : children ) {
					Eintrag entry = buildFileTree( child, filter );
					
					if ( entry != null )
						folder.addKind( entry );
				}
			
			return folder;
		}
		
		return null;
	}

	private static String readPath() {
		try ( BufferedReader is = new BufferedReader( new FileReader( pathStore ) ) ) {
			return is.readLine();
		} catch ( IOException e ) {
			
		}
		
		return "";
	}
	
	private static void storePath( String path ) {
		try ( BufferedWriter os = new BufferedWriter( new FileWriter( pathStore ) ) ) {
			os.write( path );
		} catch ( IOException e ) {
		}
	}

}
