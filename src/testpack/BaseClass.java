package testpack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BaseClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseclassMethods();
		BaseClass base = new BaseClass();
		base.add(4, 5);
		base.add(1, 2, 3);
        base.cal(2, 3, 4, 5);

        base.display();
        base.sortIntArrayByYuvaraj();
        base.sortIntArrByJalal();
		base.sortCharArrayDhivagar();
		base.sortIntArrayByNaren();
		base.sortAnArrayByShahul();
		base.addOne("xyz");
		base.sortIntArrByRamya();
		base.basic();
	}
	public void basic() {
		System.out.println("Hello");
		
		}
	public static void baseclassMethods() {
		System.out.println("Dhivagar modified logic");
	}

	public void add(int a, int b) {
		System.out.println(a + b);
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

	public void cal(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}

	
	public void addOne(String a) {
		System.out.println(a);
	
	}	
	
	
	public void sortAnArrayByShahul() {
		List<Integer> a= new ArrayList<Integer>();
		a.add(5);
		a.add(6);
		a.add(1);
		a.add(4);
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
	
	public void sortIntArrByRamya() {
		int[] arr= {3,11,6,2,1,15};
		System.out.println("Integer array before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("After sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void sortIntArrByJalal() {
		int[] sortdata = {6,5,4,3,2,1};
		System.out.println("Data before sort");
		for(int i=0;i<sortdata.length;i++) {
			System.out.println(sortdata[i]);
		}
		Arrays.sort(sortdata);
		System.out.println("Data after sort");
		for(int i=0;i<sortdata.length;i++) {
			System.out.println(sortdata[i]);
		}

		
	}


	public void sortCharArrayDhivagar() {
		char[] name = { 'd', 'h', 'i', 'v', 'a', 'g', 'a', 'r'};
		System.out.println("BEFORE NAME SORT");
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]);
		}
		Arrays.sort(name);
		System.out.println("AFTER NAME SORT");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
	}
}
	public void sortIntArrayByNaren() {
		int[] sort = {4,5,3,1,6,2};
		System.out.println("before sort");
		for(int i=0;i<sort.length;i++) {
			System.out.println(sort[i]);
		}
		Arrays.sort(sort);
		System.out.println("after sort");
		for(int i=0;i<sort.length;i++) {
			System.out.println(sort[i]);
		}
	}

public void display()
{
	System.out.println("sorting");
}

	public void sortArraySowji() {
		List<Integer> li= new ArrayList<Integer>();
		li.add(6);
		li.add(9);
		li.add(10);
		li.add(4);
		System.out.println(" sort");
		for (Object o : li) {
			System.out.println(o);
		

	}
	}

	public void sortIntArrayByYuvaraj() {
		int[] sort = {4,5,3,1,6,2};
		System.out.println("before sort");
		for(int i=0;i<sort.length;i++) {
			System.out.println(sort[i]);
		}
		Arrays.sort(sort);
		System.out.println("after sort");
		for(int i=0;i<sort.length;i++) {
			System.out.println(sort[i]);
		}
	
		
	}
}




