class Solution {
    public boolean isPalindrome(String s) {
        String r=s.toLowerCase();
        
        int j=0;
        char a[]= new char [s.length()];
        for(char i:r.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                  a[j]=i;
                  j++;
            }
        }
       int  i=0;
       int k=j-1;
       while(i<k){
        
        if(a[i]!=a[k]){
            return false;
        }
        i++;
        k--;
       }
      
    return true;
    }
}
