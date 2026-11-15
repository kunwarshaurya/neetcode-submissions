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
    public int minMeetingRooms(List<Interval> list) {
        if(list.size()>0){
        int[] start = new int[list.size()];
        int[] end = new int[list.size()];
        for(int i=0;i<list.size();i++){
            start[i] = list.get(i).start;
            end[i] = list.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
       int  i = 0;
       int j = 0;
       int room = 0;
       int ans  = Integer.MIN_VALUE;
        for(int k = 0;i<start.length;k++){
            if(start[i]<end[j]){
                room++;
                ans = Math.max(ans,room);
                i++;

            }else{
                room--;
                j++;
            }
        }
        return ans;
        }
        return 0;
    }
}
