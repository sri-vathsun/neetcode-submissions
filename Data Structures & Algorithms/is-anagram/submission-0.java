class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0; i<s.length();i++){
            char c=s.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for(int j=0; j<t.length();j++){
            char b=t.charAt(j);
            map2.put(b, map2.getOrDefault(b, 0) + 1);
        }
        return map1.equals(map2);

    }
}
