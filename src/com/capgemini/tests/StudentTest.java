package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Laptop;
import com.capgemini.model.Student;

public class StudentTest {

	private Student student1;
	private Student student2;
	private Student student3;
	private Student student4;
	private Student student5;

	@Before
	public void setUp() {
		student1 = new Student(11, "mehvash", "thane", "thane", "A");
		student2 = new Student(12, "shraddha", "nashik", "nashik", "B");
		student3 = new Student(13, "akshata", "pen", "raigad", "A");
		student4 = new Student(11, "mehvash", "thane", "thane", "B");
		student5 = new Student(14, "mehvash", "pen", "raigad", "C");
	}

	@Test
	public void testStudentMaintaingInsertionOrder() {
		ArrayList<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		Iterator<Student> it = students.iterator();
		assertEquals(student1, it.next());
		assertEquals(student2, it.next());
		assertEquals(student3, it.next());
		assertEquals(student4, it.next());
	}

	@Test
	public void testStudentMaintaingNaturalOder() {
		TreeSet<Student> students = new TreeSet<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		Iterator<Student> it = students.iterator();
		assertEquals(student3, it.next());
		assertEquals(student4, it.next());
		assertEquals(student5, it.next());
		assertEquals(student2, it.next());

	}
	
	@Test
	public void testStudentWithHashMapToGetFruitName() {
		HashMap<String, String> students= new HashMap<>();
		students.put(student1.getName(), "Apple");
		students.put(student2.getName(), "Banana");
		students.put(student3.getName(), "kiwi");
		students.put(student4.getName(), "grapes");
		students.put(student5.getName(), "Apple");
		assertEquals("Apple", students.get(student1.getName()));
		assertEquals("Banana", students.get(student2.getName()));
		assertEquals("kiwi", students.get(student3.getName()));
		assertEquals("Apple", students.get(student5.getName()));
	}
	
//	@Test
//	public void testStudentWithHashMapToGetStudentName() {
//		TreeMap<String, String> students= new TreeMap<>();
//		students.put(student1.getName(), "Apple");
//		students.put(student2.getName(), "Banana");
//		students.put(student3.getName(), "kiwi");
//		students.put(student4.getName(), "grapes");
//		assertEquals("shraddha mehvash akshata", students.keySet());
//		assertEquals("Banana", students.get(student2.getName()));
//		assertEquals("kiwi", students.get(student3.getName()));
//		assertEquals("Apple", students.get(student5.getName()));
//	}
}
