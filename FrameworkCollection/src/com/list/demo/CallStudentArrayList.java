package com.list.demo;

import java.util.ArrayList;

public class CallStudentArrayList extends Student {
	
	public CallStudentArrayList(String stuName, int rollNo, int stuAge) {
		super(stuName, rollNo, stuAge);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleTestforPOJO();

	}
	public static void sampleTestforPOJO()
	{
		ArrayList<Student> arrayList= new ArrayList<Student>();
		arrayList.add(new Student("Bishnu",11,23));
		arrayList.add(new Student("Shiva",12,24));
		arrayList.add(new Student("Bharma",13,24));
		System.out.println(arrayList);
	}

}
