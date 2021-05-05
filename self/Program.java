package self;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program {
	public static void main(String[] args) {
		Path proj = Paths.get(".").toAbsolutePath().normalize(); //Текущая директория
		Path src = Paths.get(proj + "/src/self/Program.java"); //путь к файлу с программой
		/*
		 * Построчное считывание из файла с программой
		 */
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(src.toString()));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.print(line + "\n");
			}
			bufferedReader.close();
		}
		catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
