class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String v : arr) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        for (String v : arr) {
            if (map.get(v) == 1) {
                k--;
                if (k == 0) {
                    return v;
                }
            }
        }
        return "";
    }
}
