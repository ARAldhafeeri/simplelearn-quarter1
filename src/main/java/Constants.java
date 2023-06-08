package main.java;

import java.util.*;

public class Constants {
	
	public static final String IMAGE_FILE_TYPE = "image";
	public static final String AUDIO_FILE_TYPE = "audio";
	public static final String VIDEO_FILE_TYPE = "video";
	public static final String DOCUMENT_FILE_TYPE = "document";
	
	public static final List<String> IMAGE_TYPES = Arrays.asList(
			"jpeg", "jpg", "png",
			"gif", "svg", "tiff", "tif"
			);
	public static final List<String> VIDEO_TYPES = Arrays.asList(
			"mp4", "avi", "mov",
			"flv", "avchd"
			);
	public static final List<String> AUDIO_TYPES = Arrays.asList(
			"m4a", "mp3", "wav"
			);
	public static final List<String> DOC_TYPES = Arrays.asList(
			"pdf", "doc", "docx", "html",
			"HTM", "XLS", "xlxs", "txt",
			"ppt", "pptx", "odp", "key"
			
			);

}
