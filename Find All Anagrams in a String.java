class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] targetFreq = new int[26];
        for (char c : p.toCharArray()) {
            targetFreq[c - 'a']++;
        }
        int[] windowFreq = new int[26];
        int left = 0;
        int right = 0;
        int windowSize = p.length();
        while (right < s.length()) {
            char c = s.charAt(right);
            windowFreq[c - 'a']++;
            if (right - left + 1 > windowSize) {
                char leftChar = s.charAt(left);
                windowFreq[leftChar - 'a']--;
                left++;
            }
            if (right - left + 1 == windowSize && Arrays.equals(windowFreq, targetFreq)) {
                result.add(left);
            }   
            right++;
        }       
        return result;
    }
}
