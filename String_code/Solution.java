public class Solution {
    public int countDistinctCharacters(String s) {
        int count = s.length();  // Start with the length of the string (assuming all are distinct initially)
        
        // Convert the string to a character array for easier manipulation
        char[] chars = s.toCharArray();
        
        // Loop through each character
        for (int i = 0; i < chars.length; i++) {
            // If the character is already encountered, skip it
            if (chars[i] == '\0') {
                continue;  // Skip already marked characters
            }
            
            // Check for duplicates of the current character
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    chars[j] = '\0';  // Mark the duplicate character
                    count--;  // Decrement the count since it's a duplicate
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "pwwkew";  // Test case
        int result = solution.countDistinctCharacters(s);
        System.out.println("Number of distinct characters: " + result);
    }
}
