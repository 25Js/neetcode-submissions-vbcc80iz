class Solution {

    public String encode(List<String> strs) {
StringBuilder encodedString = new StringBuilder();
        for (String s : strs) {
            encodedString.append(s.length()).append('#').append(s);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
List<String> decodedStrs = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int j = i;
            // Find the delimiter '#'
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // Extract the length of the next string
            int length = Integer.parseInt(str.substring(i, j));
            
            // Extract the actual string using the length
            int stringStart = j + 1;
            int stringEnd = stringStart + length;
            decodedStrs.add(str.substring(stringStart, stringEnd));
            
            // Move the pointer 'i' to the start of the next encoded string chunk
            i = stringEnd;
        }
        
        return decodedStrs;
    }
}
