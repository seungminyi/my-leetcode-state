class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String temp = new String(chars);

            if(!map.containsKey(temp)) {
                map.put(temp, new ArrayList());
            }

            map.get(temp).add(s);
        }
        return new ArrayList(map.values());
    }
}