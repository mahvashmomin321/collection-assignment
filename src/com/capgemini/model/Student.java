package com.capgemini.model;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{
	private int rollnumber;
	private String name;
	private String city;
	private String schoolDistrict;
	private String ranking;


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(int rollnumber, String name, String city, String schoolDistrict, String ranking) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.ranking = ranking;
	}


	

	public int getRollnumber() {
		return rollnumber;
	}



	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getSchoolDistrict() {
		return schoolDistrict;
	}



	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}



	public String getRanking() {
		return ranking;
	}



	public void setRanking(String ranking) {
		this.ranking = ranking;
	}



	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", city=" + city + ", schoolDistrict="
				+ schoolDistrict + ", ranking=" + ranking + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(rollnumber,name, city, schoolDistrict);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student))
			return false;
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Student s = (Student) obj;
		if (this.rollnumber == s.rollnumber && this.name == s.name && this.city == s.city && this.schoolDistrict==s.schoolDistrict)
			return true;
		else
			return false;
	}

	@Override
	public int compareTo(Student student) {
		String name1= this.name;
		String name2=student.name;
		int result = name1.compareTo(name2);
		if(result==0) {
				result=Integer.compare(this.rollnumber, student.rollnumber);
		}
		return result;
		
	}


	

}
