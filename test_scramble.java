import java.util.Random;
import java.util.Scanner;

public class test_scramble {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random randomNumber = new Random();
		System.out.print("Enter your input string: ");
		String sentence = scan.nextLine();
		System.out.print("Enter the mode:  Easy or Expert. ");
		String mode = scan.nextLine();


		String[] wordArray = sentence.split(" ");
		String result = "";

		// Scramble using Fisher-Yates shuffle

		for (int i = 0; i < wordArray.length; i++) {
			for (int j = 0; j < wordArray[i].length(); j++) {
				int first = randomNumber.nextInt(wordArray[i].length());
				int second = randomNumber.nextInt(wordArray[i].length());
				if (first > second) {
					// Swap letters

					int temp = first;
					first = second;
					second = temp;
				}

				if (first != second) {
					wordArray[i] = wordArray[i].substring(0, first) + wordArray[i].charAt(second)
							+ wordArray[i].substring(first + 1, second) + wordArray[i].charAt(first)
							+ wordArray[i].substring(second + 1);
				}
			}
		}

		for (int i = 0; i < wordArray.length; i++) {
			result = result + wordArray[i] + " ";
		}

		System.out.println("\nYour scrambled string is: " + result);



	}
}