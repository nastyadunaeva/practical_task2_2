package documentation;

import java.io.BufferedReader;
import java.io.FileReader;

public class Program {
	public static void main(String[] args) {
		String filePath = "src/documentation/text.txt"; // Относительный путь к файлу
		System.out.println("Text where java occus 3 times:");
		/*
		 * Считываем из файла, используя BufferedReader
		 */
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
			int symbol = 0;
			int count_java = 0; // Счетчик слова java
			/*
			 * Храним текущий символ и 3 предыдущих
			 */
			char first = 0;
			char second = 0;
			char third = 0;
			char fourth = 0;
			while ((symbol = bufferedReader.read()) != -1) {
		        char c = (char) symbol;
		        System.out.print(c);
		        first = second;
		        second = third;
		        third = fourth;
		        fourth = c;
		        /*
		         * Проверка на слово java
		         */
		        if (((first == 'j') || (first == 'J')) && (second == 'a') && (third == 'v') && (fourth == 'a')) {
		        	count_java++;
		        	if (count_java == 3) break;
		        }
			}
			bufferedReader.close();
		}
		catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
