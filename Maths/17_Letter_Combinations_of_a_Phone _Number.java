class Solution {
    private static final Map<Character, String> map = new HashMap<>(Map.of(
            '1', "",
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
    ));

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.isEmpty()) return ans;

        letterCombinations(digits, 0, new StringBuilder(), ans);
        return ans;
    }

    private void letterCombinations(String digits, int index, StringBuilder current, List<String> ans) {
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);

        for (char ch : map.get(digit).toCharArray()) {
            current.append(ch);
            letterCombinations(digits, index + 1, current, ans);
            current.deleteCharAt(current.length() - 1);
        }
    }
}