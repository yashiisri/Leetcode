import java.util.Stack;

class Solution {
    public int minInsertions(String s) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i); // Store the index or just push any value to track '('
            } else { // Handling the ')' character
                if (!stack.isEmpty()) {
                    // Check if there's a double '))'
                    if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                        i++; // Skip the next character because it's part of the pair
                    } else {
                        count++; // Need one more ')' to make it a pair
                    }
                    stack.pop(); // Found a matching '('
                } else {
                    // No matching '('
                    if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                        count++; // One ')' needed
                        i++; // Skip the next character
                    } else {
                        count += 2; // Need to insert two characters
                    }
                }
            }
        }

        // Unmatched '(' left in the stack requires two ')' each
        return count + 2 * stack.size();
    }
}
