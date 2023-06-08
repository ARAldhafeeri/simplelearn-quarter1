package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Constants;
import main.java.Utils;

public class UtilsTest {

	@Test
	public void testGetFileExtentionDocument() {
		String file = "example.txt";
		
		String fileCategory = Utils.getExtensionByStringHandling(file);
		assertEquals(Constants.DOCUMENT_FILE_TYPE, fileCategory);
	}
	
	@Test
	public void testGetFileExtentionImage() {
		String file = "example.png";
		
		String fileCategory = Utils.getExtensionByStringHandling(file);
		assertEquals(Constants.IMAGE_FILE_TYPE, fileCategory);
	}
	
	
	@Test
	public void testGetFileExtentionVideo() {
		String file = "example.mp4";
		
		String fileCategory = Utils.getExtensionByStringHandling(file);
		assertEquals(Constants.VIDEO_FILE_TYPE, fileCategory);
	}
	
	
	@Test
	public void testGetFileExtentionAudio() {
		String file = "example.mp3";
		
		String fileCategory = Utils.getExtensionByStringHandling(file);
		assertEquals(Constants.AUDIO_FILE_TYPE, fileCategory);
	}

}
