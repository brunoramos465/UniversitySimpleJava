package entities;

import java.time.LocalDate;

public class Pessoa {
	

	private String name;
	private LocalDate birthDate;
	private String address;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String name, LocalDate birthDate, String address) {
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setbirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}