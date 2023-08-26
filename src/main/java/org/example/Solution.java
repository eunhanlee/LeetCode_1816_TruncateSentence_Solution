package org.example;

public class Solution {
    /**
     * Truncates the given sentence to contain only the first 'k' words.
     *
     * @param s The input sentence to be truncated.
     * @param k The number of words to retain in the truncated sentence.
     * @return The truncated sentence containing the first 'k' words.
     */
    public String truncateSentence(String s, int k) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && ++counter == k) {
                return s.substring(0, i);
            }
        }

        return s;
    }

}