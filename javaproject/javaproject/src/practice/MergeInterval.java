package practice;
import java.util.*;
public class MergeInterval {

	public static void main(String[] args) {
		ArrayList<Interval>list=new ArrayList<>();
      list.add(new Interval(1,2));
      list.add(new Interval(3,5));
      list.add(new Interval(6,7));
      list.add(new Interval(8,10));
      list.add(new Interval(12,16));
     list= insert(list,new Interval(4,9));
     for(Interval it:list) {
    	 System.out.println(it.start+" "+it.end);
     }
	}
	 public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
	       ArrayList<Interval> result = new ArrayList<>();
	    for (int i = 0; i < intervals.size(); i++) {
	      Interval interval = intervals.get(i);
	      if (interval.end < newInterval.start) {
	        result.add(interval);
	      } else if (newInterval.end < interval.start) {
	        result.add(newInterval);
	        result.addAll(intervals.subList(i, intervals.size()));
	        return result;
	      } else {
	        int start = Math.min(newInterval.start, interval.start);
	        int end = Math.max(newInterval.end, interval.end);
	        newInterval.start = start;
	        newInterval.end = end;
	      }
	    }

	    result.add(newInterval);

	    return result;
	    }
}
 class Interval {
    int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }