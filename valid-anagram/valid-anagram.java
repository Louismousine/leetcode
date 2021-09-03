class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        char[] cc = t.toCharArray();
        Arrays.sort(cc);
        return new String(c).equals(new String(cc));
    }
}