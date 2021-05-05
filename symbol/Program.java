package symbol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		String filePath = "src/symbol/text.txt"; // Относительный путь к файлу
		/*
		 * Считываем символ, количество которого надо посчитать
		 */
		System.out.print("Enter a symbol to count: ");
		Scanner in = new Scanner(System.in);
		char main_symbol = in.next().charAt(0);
		in.close();
		int count = 0;
		/*
		 * Считываем из файла, используя BufferedReader
		 */
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
			int symbol = bufferedReader.read();
			while (symbol != -1) {
		        char c = (char) symbol;
		        if (c == main_symbol) count++;
		        System.out.print(c);
				symbol = bufferedReader.read();
			}
			bufferedReader.close();
			System.out.print("Amount of symbols: " + count);
		}
		catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
