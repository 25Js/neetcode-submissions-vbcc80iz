class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length()  ){
            return false;
        }
        if( s.length()==0){
            return true;
        }
        int i=0;
        int j=0;
        while(i<t.length()){
            if(j==s.length()){
                break;
            }
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            
            i++;
        }
        return j==s.length()?true:false;
    }
}