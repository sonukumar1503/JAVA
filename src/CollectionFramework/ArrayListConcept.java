package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
		// dynamic array  -- ArrayList
		//1. it can contain duplicate value
		//maintain insertion order
		//3. Synchronized not
		//4. allows random access to fetch element because it store the the value on the basis of index
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add("20");
		ar.add("30");
		ar.add("40");
		System.out.println(ar.size());
		
		System.out.println(ar.get(3));
		
		// to print all the value of array list
		
		for (int i = 0; i< ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		// Non generic vs generic
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(10);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Selenium");
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
		Employee e1 = new Employee("Tom", 27, "QA");
		Employee e2 = new Employee("Coolon", 28, "DEV");
		Employee e3 = new Employee("Peter", 29, "Admin");
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		// Iterator to traverse the value
		System.out.println("*******************************************************");
		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()){
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("*******************************************************");
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("C#");
		ar5.add("JAVA");
		ar5.add("Oracle");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Developer");
		ar6.add("Tester");
		ar6.add("DBA");
		
		ar5.addAll(ar6);
		
		for (int i = 0; i<ar5.size(); i++){
			System.out.println(ar5.get(i));
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		ar5.removeAll(ar6);
		for (int i = 0; i<ar5.size(); i++){
			System.out.println(ar5.get(i));
		}
		System.out.println("*************Retain All ****************");
		//retainALL
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("C#");
		ar7.add("JAVA");
		ar7.add("Oracle");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Developer");
		ar8.add("JAVA");
		ar8.add("DBA");
		
		ar7.retainAll(ar8);
		
		for (int i = 0; i<ar7.size(); i++){
			System.out.println(ar7.get(i));
		}
		
		
	}

}
