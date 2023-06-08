package main.java;

public abstract class File {
	
	private String fileName;
	private long fileSize;
	 
	 public long getFileSize() {
		 return this.fileSize;
	 }; 
	 
	 public void setFileSize(long fileSize) {
		 this.fileSize = fileSize;
		 
	 };
	 
	 public void setFileName(String fileName) {
		 this.fileName = fileName;
	 };
	 
	 public String getFileName() {
		 return this.fileName;
		 
	 }; 
	 
	
	
}
