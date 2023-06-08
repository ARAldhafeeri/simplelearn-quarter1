package main.java;
import org.apache.commons.io.FilenameUtils;

public class Utils {

	public static String getExtensionByStringHandling(String filename) {
		
	    String fileExtention =  FilenameUtils.getExtension(filename).toLowerCase();
	    
	    if(Constants.VIDEO_TYPES.contains(fileExtention)) {
	    	
	    	return Constants.VIDEO_FILE_TYPE;
	    	
	    } else if (Constants.AUDIO_TYPES.contains(fileExtention)) {
	    	
	    	return Constants.AUDIO_FILE_TYPE;
	    	
	    }  else if (Constants.IMAGE_TYPES.contains(fileExtention)) {
	    	
	    	return Constants.IMAGE_FILE_TYPE;
	    	
	    }  else if (Constants.DOC_TYPES.contains(fileExtention)) {
	    	
	    	return Constants.DOCUMENT_FILE_TYPE;
	    	
	    } else {
	    	
	    	throw new Error("the file extention is not allowed");
	    	
	    } 
	    
	}
	
	public static String getFileName(String filename) {
		return FilenameUtils.getName(filename).toLowerCase();
	}
}
