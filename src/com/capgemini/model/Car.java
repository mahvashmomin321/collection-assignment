package com.capgemini.model;

import java.util.Objects;

public class Car implements Comparable<Car>{
	private String brands;
	private String model;
	private int year;
	private double price;

	public Car() {
		super();
	}

	public String getBrands() {
		return brands;
	}

	public void setBrands(String brands) {
		this.brands = brands;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car(String brands, String model, int year, double price) {
		super();
		this.brands = brands;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brands=" + brands + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brands, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car))
			return false;
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Car c = (Car) obj;
		if (this.brands == c.brands && this.model == c.model)
			return true;
		else
			return false;
	}


	@Override
	public int compareTo(Car car) {
		String brand1=this.brands;
		String brand2=car.brands;
		int result = brand1.compareTo(brand2);

		return result;
	}
}
