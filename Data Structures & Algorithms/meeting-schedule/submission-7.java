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

        for(int i = 0; i <intervals.size()-1; i++ ){
            if(intervals.get(i).end > intervals.get(i+1).start){
                end = Math.max(end,intervals.get(i).end);
                return false;
            } 
            // else {
            //     start = intervals.get(i).start;
            //     end = intervals.get(i).end;
            // }
        }
        // for(Interval time : intervals){
        //     System.out.println(time.start + " " + time.end);
        // }
        return true;
    }
}
