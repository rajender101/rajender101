package CompareLinkList;

import java.util.*;

public class EmpComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("rahul",43));
		al.add(new Employee("sohan",24));
		al.add(new Employee("tohan",20));
		Collections.sort(al,new AgeComparator());
		for(Employee e:al)
		{
			System.out.println(e.name+" "+e.age);
		}

	}

}
