package CompareLinkList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListUnion_Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListUnion_Intersection obj1 = new LinkedListUnion_Intersection();
		obj1.createLLUnion();

	}
	public void createLLUnion()
	{
		LinkedList<Integer> ll1 = new LinkedList<>();
		LinkedList<Integer> ll2 = new LinkedList<>();
		LinkedList<Integer> ll3 = new LinkedList<>();
		Set<Integer> s1= new HashSet<>();
		ll1.add(5);
		ll1.add(6);
		ll1.add(7);
		ll1.add(8);
		ll1.add(9);
		ll2.add(9);
		ll2.add(10);
		ll2.add(11);
		System.out.println(ll1);
		System.out.println(ll2);
		s1.addAll(ll1);
		s1.addAll(ll2);
		System.out.println("Intersection of ll1 and ll2 is "+s1);
		
		///intersection
		for(Integer e:ll1)
		{
			if(ll2.contains(e))
			{
				ll3.add(e);
			}
		}
		
		System.out.println("Intersection of ll1 and ll2 is "+ll3);
	}
	


}
