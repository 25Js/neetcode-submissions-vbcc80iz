class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        int n=word1.length();
        int m=word2.length();
       String r="";
       while( i<n && j<m){
        r+=word1.charAt(i);
        r+=word2.charAt(j);
        i++;
        j++;

       }
       while(i<n){
       
        r+=word1.charAt(i);
        i++;
       }
        while(j<m){
       
        r+=word2.charAt(j);
        j++;
       }
       return r;

    }
}