package br.com.blogspot.autociencia.agenda.entity;

public class Contact {
	private String name;
	private String email;
	private Integer number;

	public Contact(String name, Integer number) {
		this.name = name;
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
