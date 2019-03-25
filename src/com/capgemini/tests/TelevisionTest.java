package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Laptop;
import com.capgemini.model.Television;

public class TelevisionTest {
	
	private Television lgTelevision;
	private Television samsungTelevisison;
	private Television sonyTelevision;
	private Television samsung;
	
	@Before
	public void Setup() {
		lgTelevision=new Television("LG","LCD",false,40000);
		samsungTelevisison= new Television("Samsung","LED",true,50000);
		sonyTelevision= new Television("Sony","plasma",false,40000);
		samsung= new Television("Samsung","LED",true,50000);
	}
	
	
	@Test
	public void testWithHashSet() {
		HashSet<Television> televisions= new HashSet<>();
		televisions.add(lgTelevision);
		televisions.add(samsungTelevisison);
		televisions.add(sonyTelevision);
		televisions.add(samsung);
		Iterator<Television> it = televisions.iterator();
		assertEquals(lgTelevision, it.next());
		assertEquals(samsungTelevisison, it.next());
		assertEquals(sonyTelevision, it.next());	
	}
	
}
