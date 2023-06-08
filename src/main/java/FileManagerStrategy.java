package main.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;

// Strategy interface
interface FileManagerStrategey {
  public boolean execute(String fileName);
}

// Implementation of strategy interface by UploadFile class
class UploadFileImpl implements FileManagerStrategey {
	
  @Override
  public boolean execute(String fileName) {
	  String uploadPath = "C:\\Users\\User\\" + fileName;

      try {
    	  File srcFile = new File(uploadPath);
    	  File destFile = new File("file", srcFile.getName());
    	  FileUtils.copyFile(srcFile, destFile);

      } catch (IOException e) {
          e.printStackTrace();
          return false;
      }
  }
}

// Implementation of strategy interface by DeleteFile class
class DeleteFileImpl implements FileManagerStrategey {
  @Override
  public boolean execute(String fileName) {
	 try {
		 
		 String deletePath = "C:\\Users\\User\\" + fileName;
		 File f = new File(deletePath);
		 if(f.delete()) {
			 System.out.println(f.getName() + " deleted");
			 return true;
		 } else {
			 System.out.println("failed to delete file");
			 return false;
		 }
	 } catch(Exception e) {
		 e.printStackTrace();
		 return false;
		 
	 }
  }
}

// Implementation of strategy interface by SearchFile class
class SearchFileImpl implements FileManagerStrategey {
  @Override
  public boolean execute(String fileName) {
	  String path  = "C:\\Users\\User\\" + fileName;
      File file = new File(path);
      System.out.println(path);
      System.out.println(file.exists());
      if (file.exists()) {
   
	      System.out.println("File found: " + file.getAbsolutePath());
	      return true;
     
      } else {
          System.out.println("Invalid directory path.");
      }
      return false;
  }
}