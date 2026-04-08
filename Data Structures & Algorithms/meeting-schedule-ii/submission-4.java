/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) {
            return 0;
        }

        // Step 1: Sort intervals by start time
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        // Step 2: Min heap to track end times
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Step 3: Add first meeting
        minHeap.add(intervals.get(0).end);

        // Step 4: Process remaining meetings
        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);

            // If earliest room is free, reuse it
            if (curr.start >= minHeap.peek()) {
                minHeap.poll();
            }

            // Allocate current meeting
            minHeap.add(curr.end);
        }

        // Step 5: Heap size = number of rooms needed
        return minHeap.size();
    }
}
