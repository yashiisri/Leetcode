class Solution {
    public List<String> splitWordsBySeparator(final List<String> words, final char separator) {
        final List<String> result = new ArrayList<>();
        final StringBuilder sb = new StringBuilder();

        for(final String word : words) {
            for(int i = 0; i < word.length(); ++i) {
                if(word.charAt(i) == separator) {
                    if(sb.length() > 0) {
                        result.add(sb.toString());
                        sb.setLength(0);
                    }
                } else {
                    sb.append(word.charAt(i));
                }
            }
            
            if(sb.length() > 0) {
                result.add(sb.toString());
                sb.setLength(0);
            }
        }

        return result;
    }
}