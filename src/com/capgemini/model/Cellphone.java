package com.capgemini.model;

import java.util.Objects;

public class Cellphone {
	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private double pricce;
	public Cellphone() {
		super();
	}

	
	public Cellphone(String company, String model, String description, String operatingSystem, double pricce) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.pricce = pricce;
	}


	@Override
	public String toString() {
		return "Cellphone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operatingSystem=" + operatingSystem + ", pricce=" + pricce + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(company,model,operatingSystem);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Cellphone))
			return false;
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Cellphone cp = (Cellphone) obj;
		if (this.company == cp.company && this.model == cp.model && this.operatingSystem == cp.operatingSystem)
			return true;
		else
			return false;
	}
}
