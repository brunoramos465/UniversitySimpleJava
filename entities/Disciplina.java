package entities;

public class Disciplina {
	
	private String name;
	private String idsubjects;
	
	public Disciplina() {
		
	}
	
	public Disciplina(String name, String idsubjects) {
		this.name = name;
		this.idsubjects = idsubjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdsubjects() {
		return idsubjects;
	}

	public void setIdsubjects(String idsubjects) {
		this.idsubjects = idsubjects;
	}
	
	
	

}
