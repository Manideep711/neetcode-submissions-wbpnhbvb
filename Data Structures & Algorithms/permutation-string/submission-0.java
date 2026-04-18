class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // build freq1
        for(char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        int windowSize = s1.length();

        for(int i = 0; i < s2.length(); i++) {
            // add current char to window
            freq2[s2.charAt(i) - 'a']++;

            // remove char going out of window
            if(i >= windowSize) {
                freq2[s2.charAt(i - windowSize) - 'a']--;
            }

            // compare arrays
            if(Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
}