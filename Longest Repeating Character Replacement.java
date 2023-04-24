class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int maxFreq = 0, maxLength = 0;
        for (int i = 0, j = 0; j < n; j++) {
            freq[s.charAt(j) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(j) - 'A']);
            if (j - i + 1 - maxFreq > k) {
                freq[s.charAt(i) - 'A']--;
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
}
