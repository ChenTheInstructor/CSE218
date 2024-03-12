package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	public static String[] readFile(String fileName) {
		File file = new File("data/" + fileName);
		String text = "";
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				text += scanner.nextLine() + " ";
			}
			String[] arr = text.split(" ");
			for(int i = 0; i < arr.length; i++) {
				arr[i] = arr[i].trim();
			}
			return arr;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
