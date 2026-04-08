class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Min-heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> heap =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            heap.add(entry);
            if (heap.size() > k) {
                heap.poll(); // Remove least frequent
            }
        }

        int[] result = new int[k];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : heap) {
            result[i++] = entry.getKey();
        }

        return result;
    }
}
