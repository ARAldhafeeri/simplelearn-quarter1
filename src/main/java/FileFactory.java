package main.java;

public class FileFactory {
	
	// singleton pattern
	private static FileFactory instance = new FileFactory();
	
	public static FileFactory getInstance() {
		return instance;
	}
	
	public File getFile(String category) {
		return new ImageFile();
	}

}
