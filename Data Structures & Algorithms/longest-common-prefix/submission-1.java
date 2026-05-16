class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String r="";
        for(int i=0;i<strs[0].length();i++){
            String s=strs[0];
            String t=strs[strs.length-1];
            
            if(s.charAt(i)==t.charAt(i)){
                r=r+s.charAt(i);
            }
            else{
                break;
            }

        }
        return r; 
    }
}