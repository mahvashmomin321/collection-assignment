package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.model.Car;
import com.capgemini.model.Laptop;

public class CarTest {

	private Car bmwCar;
	private Car renaultCar;
	private Car jaguarCar;
	private Car bmw;

	@Before
	public void setUp() {
		bmwCar = new Car("bmw", "bmw", 2015, 200000);
		renaultCar = new Car("renault", "lodgy", 2017, 300000);
		jaguarCar = new Car("jaguar", "lx", 2012, 400000);
	}

	@Test
	public void testWithTreetSet() {
		TreeSet<Car> cars = new TreeSet<>();
		cars.add(bmwCar);
		cars.add(renaultCar);
		cars.add(jaguarCar);
		assertEquals(3, cars.size());
	}

	@Test
	public void testWithTreeSetAndSortingInAscendingOrder() {
		TreeSet<Car> cars = new TreeSet<>();
		cars.add(bmwCar);
		cars.add(renaultCar);
		cars.add(jaguarCar);
		Iterator<Car> it = cars.iterator();
		assertEquals(bmwCar, it.next());
		assertEquals(jaguarCar, it.next());
		assertEquals(renaultCar, it.next());

	}
}
