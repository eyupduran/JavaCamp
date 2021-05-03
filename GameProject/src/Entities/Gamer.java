package Entities;

import Abstract.Entity;

public class Gamer implements Entity {

	private int id;
	private String Firstame;
	private String lastName;
	private Game[] games;

	public Gamer() {

	}

	public Gamer(int id, String firstame, String lastName, Game[] games) {
		super();
		this.id = id;
		Firstame = firstame;
		this.lastName = lastName;
		this.games = games;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstame() {
		return Firstame;
	}

	public void setFirstame(String firstame) {
		Firstame = firstame;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Game[] getGames() {
		return games;
	}

	public void setGames(Game[] games) {
		this.games = games;
	}

}
