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
        // if(intervals.size() <= 1) return 1;
        intervals.sort((a,b)-> a.start - b.start);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(Interval interval : intervals){
            if(minHeap.size() > 0 && minHeap.peek() <= interval.start){
                minHeap.poll();
            }
            minHeap.offer(interval.end);
        } 
        return minHeap.size();
    }
}
