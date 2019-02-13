package testpack;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter  roll number");
		int rollNo= sc.nextInt();
		System.out.println("Student roll no:"+rollNo);

		System.out.println("Enter Name");
		String name= sc.next();
		System.out.println("Student Name:"+name);

	}

}
