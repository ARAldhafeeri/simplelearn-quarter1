package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.*;



public class FileFactoryTest {
	@Test
	public void testFileFactoryReturnImageFIle() {
		
		String imageType = Constants.IMAGE_FILE_TYPE;

		FileFactory fileFactory = new FileFactory();
		
		FileFactory instance = fileFactory.getInstance();
		
		var file = instance.getFile(imageType);
		
		String actualClassName = file.getClass().getName().toString();
		
		
		assertEquals(actualClassName,"main.java.ImageFile");
		
	}
	
	
	@Test
	public void testFileFactoryReturnAudioFile() {
		
		String audioType = Constants.AUDIO_FILE_TYPE;

		FileFactory fileFactory = new FileFactory();
		
		FileFactory instance = fileFactory.getInstance();
		
		var file = instance.getFile(audioType);
		
		String actualClassName = file.getClass().getName().toString();
		
		
		assertEquals(actualClassName,"main.java.AudioFile");
		
	}
	
	
	@Test
	public void testFileFactoryReturnDocumentile() {
		
		String docType = Constants.DOCUMENT_FILE_TYPE;

		FileFactory fileFactory = new FileFactory();
		
		FileFactory instance = fileFactory.getInstance();
		
		var file = instance.getFile(docType);
		
		String actualClassName = file.getClass().getName().toString();
		
		
		assertEquals(actualClassName,"main.java.DocumentFile");
		
	}
	
	@Test
	public void testFileFactoryReturnVideoFile() {

		String vidType = Constants.VIDEO_FILE_TYPE;

		FileFactory fileFactory = new FileFactory();
		
		FileFactory instance = fileFactory.getInstance();
		
		var file = instance.getFile(vidType);
		
		String actualClassName = file.getClass().getName().toString();
		
		
		assertEquals(actualClassName,"main.java.VideoFile");
		
	}



}
