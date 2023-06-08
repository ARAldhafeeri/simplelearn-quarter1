package main.java;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			FileManager.run();
			Integer userSelection = sc.nextInt();
			switch (userSelection) {
			case 1:
				try {
					System.out.println("please enter file path e.g. C:/Userrs/User/ e.g. text.txt");
					String fileName = sc.next();
					File file = FileFactory.getFile(fileName);
					file.setFileName(fileName);
					FileManager.search(fileName);
				} catch (Exception e) {
					System.out.println("failed file does not exists");
				}
		        break;
			case 2: 
				try {
					System.out.println("please enter file name located C:/Userrs/User/");
					String fileName = sc.next();
					File file = FileFactory.getFile(fileName);
					file.setFileName(fileName);
					FileManager.delete(fileName);
				} catch (Exception e) {
					System.out.println("failed file does not exists");
				}
				break;
				
			case 3: 
				try {
					System.out.println("please enter file name located C:/Userrs/User/");
					String fileName = sc.next();
					File file = FileFactory.getFile(fileName);
					file.setFileName(fileName);
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
