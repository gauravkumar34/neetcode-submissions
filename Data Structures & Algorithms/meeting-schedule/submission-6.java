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
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size() == 0) return true;
        intervals.sort((a, b) -> a.start - b.start);
        int start  = intervals.get(0).start;
        int end  = intervals.get(0).end;

        for(int i = 1; i <intervals.size(); i++ ){
            if(intervals.get(i).start < end){
                end = Math.max(end,intervals.get(i).end);
                return false;
            } 
            else {
                start = intervals.get(i).start;
                end = intervals.get(i).end;
            }
        }
        // for(Interval time : intervals){
        //     System.out.println(time.start + " " + time.end);
        // }
        return true;
    }
}
