package main.java;

public class FileManager {
	
	// posible future optimization to use Trie data structure
	private static Trie trie = new Trie();
	private static SearchFileImpl search = new SearchFileImpl();
	private static DeleteFileImpl delete = new DeleteFileImpl();
	private static UploadFileImpl upload = new UploadFileImpl();
	


	public static void search(String fileName) {
		search.execute(fileName);

	}
	
	public static void delete(String fileName) {
		delete.execute(fileName);
	}
	
	public static void upload(String fileName) {
		upload.execute(fileName);
	}
	
	public static void run() {
		System.out.println(
				"Welcome to the file manager please enter an option from the following 1 to 4:"
				+ "\n1. search file"
				+ "\n2. delete file"
				+ "\n3. upload file"
				+ "\n4. close program"
				);
	}
	
	public static void close() {
		System.exit(0);
	}
	
}
