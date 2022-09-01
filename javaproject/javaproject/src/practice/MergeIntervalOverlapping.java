package practice;

import java.util.*;

public class MergeIntervalOverlapping {

	public static void main(String[] args) {
		ArrayList<Interval>list=new ArrayList<>();
	      list.add(new Interval(1,3));
	      list.add(new Interval(2,6));
	      list.add(new Interval(8,10));
	      list.add(new Interval(15,18));
          list=merge(list);
          for(Interval it:list) {
         	 System.out.println(it.start+" "+it.end);
          }
	}
	 public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
	     if(intervals==null|| intervals.size()<=1){return intervals;}
		Collections.sort(intervals, new Comparator<Interval>(){
	      public int compare(Interval i1, Interval i2) {
	        int c = i1.start - i2.start;
	        if (c != 0) {
	          return c;
	        }
	        return i1.end - i2.end;
	      }
	    });
		ArrayList<Interval>result=new ArrayList<>();
		Interval prev=intervals.get(0);
		for(int i=1; i<intervals.size(); i++) {
			Interval arr=intervals.get(i);
			if(prev.end>=arr.start) {
				prev.end=Math.max(arr.end,prev.end);
			}else {
				result.add(prev);
				prev=arr;
			}
			if(i==intervals.size()-1) {
				result.add(prev);
			}
		}
		
		return result;
		
	    }
}
