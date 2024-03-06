package p7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ListMerger {
	
	public static ArrayList<Student> getMergedList(ArrayList<ArrayList<Student>> lists, Comparator<Student> c) {
		PriorityQueue<Student> pq = new PriorityQueue<>(c);
		addLists(pq, lists);
		return getMergedList(pq);
		
	}

	private static ArrayList<Student> getMergedList(PriorityQueue<Student> pq) {
		ArrayList<Student> mergedList = new ArrayList<>(pq.size());
		while(!pq.isEmpty()) {
			mergedList.add(pq.poll());
		}
		return mergedList;
	}

	private static void addLists(PriorityQueue<Student> pq, ArrayList<ArrayList<Student>> lists) {
		for(ArrayList<Student>  list : lists) {
			for(Student s : list) {
				pq.add(s);
			}
		}
	}
}
