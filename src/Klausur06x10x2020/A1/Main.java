package Klausur06x10x2020.A1;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File f = new File("/name");
		
		FileTree ft = new FileTree(new FileCounter());
		
		ft.traverse(f);
		
	}
}
