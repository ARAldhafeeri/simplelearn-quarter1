package main.java;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			FileManager.run();
			Integer userSelection = sc.nextInt();
			String fileName  = "";
			
			if(userSelection != 4) {
				System.out.println("please enter file path e.g. C:/Userrs/User/ e.g. text.txt");
				fileName = sc.next();
				String Category = Utils.getExtensionByStringHandling(fileName);
				File file = FileFactory.getFile(Category);
				file.setFileName(fileName);
			}
	
			
			switch (userSelection) {
			case 1:
				try {
					FileManager.search(fileName);
				} catch (Exception e) {
					System.out.println("failed file does not exists");
				}
		        break;
			case 2: 
				try {
					FileManager.delete(fileName);
				} catch (Exception e) {
					System.out.println("failed file does not exists");
				}
				break;
				
			case 3: 
				try {
					FileManager.upload(fileName);
				} catch (Exception e) {
					System.out.println("failed file does not exists");
				}
				break;
			case 4:
				try {
					System.out.println("good bye");
					FileManager.close();
				} catch (Exception e) {
					System.out.println("failed file does not exists");
				}
				break;
				
			}
		}
		
	}
}
