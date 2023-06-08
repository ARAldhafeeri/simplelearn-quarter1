package main.java;

public class FileFactory {
	
	// singleton pattern
	private static FileFactory instance = new FileFactory();
	
	
	public static FileFactory getInstance() {
		return instance;
	}
	
	public static File getFile(String category) {
		switch (category){
		case Constants.IMAGE_FILE_TYPE:
			return new ImageFile();
			
		case Constants.AUDIO_FILE_TYPE:
			return new AudioFile();
		
		case Constants.VIDEO_FILE_TYPE:
			return new VideoFile();
			
		case Constants.DOCUMENT_FILE_TYPE:
			return new DocumentFile();
		
		default:
			return new DocumentFile();
			
		}
		
	}

}
