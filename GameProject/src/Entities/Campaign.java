package Entities;

import Abstract.Entity;

public class Campaign implements Entity {
	private int id;
	private String name;
	private String dateOfStart;

	public Campaign() {

	}

	public Campaign(int id, String name, String dateOfStart) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfStart = dateOfStart;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfStart() {
		return dateOfStart;
	}

	public void setDateOfStart(String dateOfStart) {
		this.dateOfStart = dateOfStart;
	}

}
