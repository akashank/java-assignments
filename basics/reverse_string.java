package in.co.capgemini.basics;
import java.util.*;

public class reverse_string {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = src.nextLine();
		String word[] = str.split(" ");
		for (int i = 0; i < word.length; i++) {
			for (int j = word[i].length() - 1; j >= 0; j--) {
				System.out.print(word[i].charAt(j));

			}
			System.out.print(" ");
		}

	}

}
