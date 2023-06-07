package main.java;

public class ImageFile extends File{
	
	private Integer imageWidth;
	private Integer imageHeight;
	
	public Integer getImageWidth() {
		return this.imageWidth;
	}
	
	public Integer getImageHeight() {
		return this.imageHeight;
	}
	
	public void setImageWidth(Integer width) {
		 this.imageWidth = width;
	}
	
	public void setImageHeight(Integer height) {
	 this.imageHeight = height;
	}

}
