package testpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseclassMethods();
		BaseClass base = new BaseClass();
		base.addOne(2, 3, 6);
		base.add(4, 5);
		base.add(1, 2, 3);
		base.sortArrayYuvaraj();
		
		
	}

	
    public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void baseclassMethods() {
		System.out.println("Dhivagar modified logic");
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public void add(String a, String b) {
		System.out.println(a + b);
	}

	public void add(String a, String b, String c) {
		System.out.println(a + b + c);
	}
	
	public void addOne(int a, int b, int c) {
		System.out.println(a*b*c);
	}	
	
	
	
	
	public void sortArrayYuvaraj() {
		List<Integer> a= new ArrayList<Integer>();
		a.add(1);
		a.add(4);
		a.add(6);
		a.add(8);
		System.out.println("Before sort");
		for (Object li : a) {
			System.out.println(li);
		}
		Collections.sort(a);
		System.out.println("After sort");
		for (Integer ali : a) {
			System.out.println(ali);
		}
		
		}

}
