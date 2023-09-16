package entities;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Aluno extends Pessoa {
	
	private Integer idStudent;
	
	List<Disciplina> subjects = new ArrayList<Disciplina>();
	
	public Aluno() {
		
	}

	public Aluno(String name, LocalDate birthDate, String address, Integer idStudent) {
		super(name, birthDate, address);
		this.idStudent = idStudent;
	}
	
	public Integer getIdStudent() {
		return idStudent;
	}
	
	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}

	public void addsubjects(Disciplina item) {
		subjects.add(item);
	}

	public void addStudentClass(Disciplina item) {
		subjects.add(item);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Disciplina dis: subjects) {
			sb.append(dis.getName());
		}
		return sb.toString();

	}
	
	
	

	
	
}
