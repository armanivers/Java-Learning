import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

public class FileTree{

	DirVisitor visitor;
	
	public FileTree(DirVisitor visitor) {
		this.visitor = visitor;
	}
	
	void traverse(File dir) {
		if(dir.isDirectory()) {
			visitor.enter(dir);
			File[] list = dir.listFiles(new PngFilter());
			for(File file : list) {
				if(file.isFile()) {
					visitor.visitFile(file);
				}else {
					traverse(file);
				}
			}
			visitor.exit(dir);
		}
	}
	
	public static void copy2(File from, File to) {
		RandomAccessFile fileFrom=null;
		RandomAccessFile fileTo=null;
		try {
			System.out.println(from.getPath());
			System.out.println(to.getPath());
			fileFrom = new RandomAccessFile("filefrom.txt", "r");
			fileTo = new RandomAccessFile("fileto.txt","rw");
			
			PrintWriter pw = new PrintWriter(new FileOutputStream(new File("D:\\Test\\fileto.txt")));
			for (int i = 0; i < fileFrom.length(); i++) {
				//fileTo.write(fileFrom.readByte());
				pw.write(fileFrom.read());
			}

//		int b;
//		while((b =fileFrom.read()) != -1) {
//			fileTo.write(b);
//			//System.out.println(b);
//		}

//		//wird bei read schon der zeiger verschoben? nein
//		while(fileFrom.read() != -1) {
//			fileTo.write(fileFrom.readByte());
//			fileFrom.skipBytes(1);
//			fileTo.skipBytes(1);
//		}

//			// Fehler spriung 2 bytes
//		while(fileFrom.read() != -1) {
//			fileTo.write(fileFrom.readByte());
//		}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fileTo!=null) {
					fileTo.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			try {
				if(fileTo!=null) {
					fileFrom.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}

		}
	}

	void copy(File from, File to) throws IOException {

		try (FileInputStream in = new FileInputStream(from);
				BufferedInputStream bufferIn = new BufferedInputStream(in);
				FileOutputStream out = new FileOutputStream(to);
				BufferedOutputStream bufferOut = new BufferedOutputStream(out)) {
			int c;
			while ((c = bufferIn.read()) != -1) {
				bufferOut.write(c);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	//Interface AutoCloseable??
	//try(Resource res = ..)
	void cat(File quelle) {
		
		try(RandomAccessFile file = new RandomAccessFile(quelle,"r")){
			//Ein zeichen weniger? + null am Ende?
			int c;
			while((c=file.read() )!= -1) {
				//am anfang war file.readChar() oder readByte() -> ging nicht
				//String ascii = file.readLine();
				System.out.print((char)c);
				//file.skipBytes(1);
			}
			//Null strings?
//			for(int i = 0; i < file.length() ; i++) {
//				System.out.println(file.readLine());
//				//file.skipBytes(1);
//			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//Aufgabe 28
	//Auf die konsole einfach durch println?
	void sayHello(OutputStream s) throws IOException{
		String t = "Hello World";
		OutputStreamWriter sw = new OutputStreamWriter(s);

		//PrintStream ps = new PrintStream(s);
		//ps.print(t.toCharArray());
		//System.setOut(ps);
		
		sw.write(t.toCharArray());
		sw.flush();
	}

}
