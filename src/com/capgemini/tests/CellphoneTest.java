package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Cellphone;
import com.capgemini.model.Student;

public class CellphoneTest {

	private Cellphone onePlus;
	private Cellphone samsung;
	private Cellphone iphone;
	private Cellphone samsung1;


	@Before
	public void setUp() {
		onePlus = new Cellphone("onePlus", "5T", "abc", "android", 34000);
		samsung = new Cellphone("samsung", "s7", "edf", "android", 20000);
		iphone = new Cellphone("iphone", "7", "abc", "ios", 50000);
		samsung1 = new Cellphone("samsung", "s7", "edf", "android", 20000);
	}

	@Test
	public void testWithHashSet() {
		HashSet<Cellphone> cellphones = new HashSet<>();
		cellphones.add(onePlus);
		cellphones.add(samsung);
		cellphones.add(iphone);
		cellphones.add(samsung1);
		Iterator<Cellphone> it = cellphones.iterator();
		assertEquals(iphone, it.next());
		assertEquals(onePlus, it.next());
		assertEquals(samsung, it.next());
	}
}
