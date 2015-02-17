package com.GodOfMen.assets;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public enum Texture {
	
	
	TEST_TEXTURE   ("Water.png"),
	
	
	;
	
	private static final String TEXTURE_FOLDER_FILE_PATH = "assets//sprites//";
	
	private BufferedImage image;
	
	/**
	 * Creates a new Texture object with the image from the given fileName.
	 * @param fileName the fileName of the image, including file extension. ex: "Tree.png"
	 */
	Texture(String fileName){
		File textureFile = new File(TEXTURE_FOLDER_FILE_PATH + fileName);
		this.image = getImage(textureFile);
	}
	
	
	/**
	 * Reads a BufferedImage from a given Image file.
	 * @param imageFile the file to read the image from
	 * @return a BufferedImage from the imageFile
	 */
	private static BufferedImage getImage(File imageFile){
		BufferedImage image;
		try{
			image = ImageIO.read(imageFile);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return image;
	}
	
	
	
	/**
	 * 
	 * @return this Texture's BufferedImage, which stores the visuals of this texture
	 */
	public BufferedImage getImage(){
		return this.image;
	}
	
	
}
