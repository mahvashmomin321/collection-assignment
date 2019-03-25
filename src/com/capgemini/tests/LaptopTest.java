package com.capgemini.tests;



import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.model.Laptop;

public class LaptopTest {

	private static Laptop dellLaptop;
	private static Laptop hpLaptop;
	private static Laptop acerLaptop;

	@BeforeClass
	public static void setUp() {
		dellLaptop = new Laptop("Dell", "abc", "windows 10", "i5");
		hpLaptop = new Laptop("Hp", "cde", "unbuntu", "i3");
		acerLaptop = new Laptop("Acer", "efg", "windows 10", "i7");
	}

	@Test
	public void testLaptopWithArrayList() {
		ArrayList<Laptop> laptops = new ArrayList<>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(acerLaptop);
		Iterator<Laptop> it = laptops.iterator();
		assertEquals(dellLaptop, it.next());
		assertEquals(hpLaptop, it.next());
		assertEquals(acerLaptop, it.next());

	}
	
	@Test
	public void testLaptopWithHashSet() {
		HashSet<Laptop> laptops= new HashSet<>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(acerLaptop);
		laptops.add(hpLaptop);
		Iterator<Laptop> it = laptops.iterator();
		assertEquals(acerLaptop, it.next());
		assertEquals(dellLaptop, it.next());
		assertEquals(hpLaptop, it.next());

	}
	
}
