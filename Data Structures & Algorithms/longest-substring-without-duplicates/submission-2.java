class Solution {
    public int lengthOfLongestSubstring(String s) {
       int i=0;
       int j=0;
       int r=0;
       HashSet<Character> h = new HashSet<>();
       for( i=0;i<s.length();i++){
        char c=s.charAt(i);
        while(h.contains(c)){
            h.remove(s.charAt(j));
            j++;
        }
        r=Math.max(r,i-j+1);
        h.add(c);

       } 

       return r;
    }
}
