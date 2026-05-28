class Solution {
    public int lengthOfLastWord(String s) {
        int i=0;
        boolean a=false;
        for(int j=s.length()-1;j>=0;j--){
            char c=s.charAt(j);
            if(c!=' '){
                a=true;
                i++;
            }
            else{
                if(a){
                    break;
                }
            }
        }
        return i;
    }
}