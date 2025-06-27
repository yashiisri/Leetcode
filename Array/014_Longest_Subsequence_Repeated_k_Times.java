class Solution {
    String r = ""; // This is our result! Starts empty, will hold the longest sequence we find.
    List<Character> l = new ArrayList<>(); // A list to store characters that appear enough times.

    public String longestSubsequenceRepeatedK(String s, int k) {
        // Let's get this party started! This is the main function. 🥳
        int[] cnt = new int[26]; // Array to count how many times each letter appears (a-z).
        for (char c : s.toCharArray()) cnt[c - 'a']++; // Loop through the string and count each letter.

        for (char c = 'a'; c <= 'z'; c++) // Loop through the alphabet to see which letters are frequent enough.
            if (cnt[c - 'a'] >= k) l.add(c); // If a letter appears at least k times, add it to our list of "good" characters.

        dfs(s, "", k); // Call our recursive function to do the heavy lifting! 🏋️‍♀️
        return r; // Return the best sequence we found! 🎉
    }

    void dfs(String s, String sub, int k) {
        // This is our recursive function (Depth-First Search). It explores all possible sequences. 🚀
        if (sub.length() > 0 && !isValid(s, sub, k)) return; // If our sequence exists but isn't a valid repeating subsequence, stop! 🚫 (optimization)
        if (sub.length() > r.length()) r = sub; // If our current sequence is longer than the best we've found, update the best! 🏆
        for (int i = l.size() - 1; i >= 0; i--) { // Loop through our list of good characters (backwards for lexicographical order).
            String nxt = sub + l.get(i); // Add a character to our current sequence.
            dfs(s, nxt, k); // Recursively call the function to explore further sequences. 🔄
        }
    }

    boolean isValid(String s, String sub, int k) {
        // This function checks if a sequence `sub` repeats k times in the string `s`. 🤔
        int j = 0, rep = 0, sl = s.length(), subl = sub.length(); // Initialize counters and lengths for efficiency.
        for (int i = 0; i < sl; i++) { // Loop through the main string `s`.
            if (sl - i < (k - rep - 1) * subl) return false; // Optimization: If we don't have enough characters left to form the required repetitions, stop! ⏱️
            if (s.charAt(i) == sub.charAt(j)) { // If the current character in `s` matches the current character in `sub`...
                if (++j == subl) { // Move to the next character in `sub`. If we reached the end of `sub`...
                    j = 0; // Reset `j` to start from the beginning of `sub`.
                    if (++rep == k) return true; // Increment the repetition counter. If we have `k` repetitions, we found a valid sequence! ✅
                }
            }
        }
        return false; // If we didn't find k repetitions, return false. ❌
    }
}