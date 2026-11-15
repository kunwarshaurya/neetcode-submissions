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
    public boolean canAttendMeetings(List<Interval> list) {
        if(list.size()>0){
        list.sort(Comparator.comparingInt(i -> i.start));
        int s1 = list.get(0).start;
        int e1 = list.get(0).end;
        for(int i = 1;i<list.size();i++){
            int s2 = list.get(i).start;
            int e2 = list.get(i).end;
            if(e1>s2){
                return false;
            }else{
                s1 = s2;
                e1 = e2;
            }
        }
        }
        return true;
    }
}
