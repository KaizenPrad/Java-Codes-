import java.util.Arrays;
import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = st.nextLine();
        String[] words = splitString(phrase);
        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            String reversed = new StringBuilder(str).reverse().toString();
            words[i] = reversed;
        }
        String finalString = String.join(" ", words);
        System.out.println(finalString);

        st.close();
    }

    public static String[] splitString(String input) {
        if (input == null || input.isEmpty()) {
            return new String[0]; // Return an empty array for null or empty input
        }
        return input.trim().split("\\s+"); // Trim and split on multiple spaces
    }
}
