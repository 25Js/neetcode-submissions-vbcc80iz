class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          HashMap<String, List<String>> h = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);

        
            String key = new String(a);

            if (h.containsKey(key)) {
                h.get(key).add(strs[i]);
            } else {
               
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                h.put(key, list);
            }
        }

        // Return all grouped anagrams
        return new ArrayList<>(h.values());
    }
}
