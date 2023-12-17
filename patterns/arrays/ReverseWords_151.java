package patterns.arrays;

public class ReverseWords_151 {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");

        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            // skipping empty strings (can happen with multiple spaces)
            if (words[i].isEmpty()) {
                continue;
            }

            result += words[i];
            // if it's not the last word, can a space
            if (i > 0) {
                result += " ";
            }
            // "world Hello "
        }

        return result;

    }
}
