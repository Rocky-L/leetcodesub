/*
 * Assumptions:
 * nums is non-empty
 * k is always valid i.e. k >= 1 && k <= nums.length
 */

// All 20 test cases are passed, 21ms solution
// contains duplicate code, will optimize in the future

public static List<Integer> topKFrequent(int[] nums, int k) {
    int count = 1;
    List<Integer> topN = new ArrayList<Integer>();
    Map<Integer, ArrayList<Integer>> sortedMap = new TreeMap<Integer, ArrayList<Integer>>();

    Arrays.sort(nums);

    for(int i = 1; i < nums.length; i++) {
        if(nums[i] != nums[i-1]){
            if (sortedMap.containsKey(count)) {
                sortedMap.get(count).add(nums[i-1]);
            } else {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(nums[i-1]);
                sortedMap.put(count, temp);
            }
            count = 1;
        } else {
            count++;
        }
    }
    if (sortedMap.containsKey(count)) {
        sortedMap.get(count).add(nums[nums.length-1]);
    } else {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(nums[nums.length-1]);
        sortedMap.put(count, temp);
    }

    Set<Integer> set = sortedMap.keySet();
    Integer[] keys = new Integer[set.size()];
    keys = set.toArray(keys);
    count = 0;

    for(int i = keys.length-1; i >= 0; i--) {
        for(Integer v: sortedMap.get(keys[i])){
            count++;
            if(count <= k) topN.add(v);
            else break;
        }
    }


    Collections.sort(topN);
    return topN;
}
