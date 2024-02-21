class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> t = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (t.containsKey(arr[i])) {
                int a = t.get(arr[i]);
                t.put(arr[i], a + 1);
            } else
                t.put(arr[i], 1);
        }
        HashSet<Integer> set = new HashSet<Integer>();
        t.forEach((k, v) -> set.add(v));
        if (t.size() == set.size())
            return true;
        else
            return false;

    }
}