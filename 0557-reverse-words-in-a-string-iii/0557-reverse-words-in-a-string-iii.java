class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            sb.append(reverseEachWord(words[i]));
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    private String reverseEachWord(String word) {
        StringBuilder result = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }

        return result.toString();
    }
}