import java.util.Random;

public class test_scramble2 {

	public static String scramble(String inputString) {
		// public static String scramble(Random random, String inputString) {
		// Convert your string into a char array:

		char char_array[] = inputString.toCharArray();
		Random r = new Random();
		// Scramble the letters using the standard Fisher-Yates shuffle,

		for (int i = 0; i < char_array.length; i++) {

			int j = r.nextInt(char_array.length);
			// Swap letters
			char temp = char_array[i];
			char_array[i] = char_array[j];
			char_array[j] = temp;
		}

		return new String(char_array);
	}


	public static void main(String[] args) {

		String sentence = "Animals are super amazing";
		System.out.println("Before: " + sentence);

		String[] word_array = sentence.split("\s");
		for (int i = 0; i < word_array.length; i++) {

			word_array[i] = test_scramble2.scramble(word_array[i]);
		}
		// String word = "Animals";
		// word = scramble(word);
		System.out.println("After : " + word_array);
		System.out.println("After : " + word_array.length);

	}
}
