class Solution {
    public boolean isPalindrome(String st) {
        String s=st.toLowerCase();
         char a[]= new char[s.length()];
         
         int k=0;
         for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' &&  s.charAt(i)<='z')|| (s.charAt(i)>='A' &&  s.charAt(i)<='Z')|| (s.charAt(i)>='0' &&  s.charAt(i)<='9')){
                    a[k]=s.charAt(i);
                    k++;
            }
         }
         int j=k-1;
         int i=0;
         while(i<j){
            if(a[i]!=a[j]){
                return false;
            }
            i++;
            j--;
         }
         return true;
    }
}
