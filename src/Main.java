import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
		//Warum throws IOException in der Main???
	public static void main(String args[]) throws IOException {
		FileTree ft = new FileTree(new DirPrinter());
		//ft.traverse(new File("D:/Passes"));
		ft.copy2(new File("D:\\Test\\filefrom.txt"), new File("D:\\Test\\fileto.txt"));
		ft.cat(new File("D:/Test/filefrom.txt"));
		FileOutputStream out = new FileOutputStream(new File("D:/Test/fileto.txt"));
		//ft.sayHello(System.out);
		//ft.sayHello(out);
	}
}
