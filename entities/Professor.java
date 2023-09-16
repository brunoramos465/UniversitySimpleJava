package entities;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Professor extends Pessoa {

	private Integer idTeacher;
	
	List<Disciplina> teacherClass = new ArrayList<Disciplina>();

	public Professor(String name, LocalDate birthDate, String address, Integer idTeacher) {
		super(name, birthDate, address);
		this.idTeacher = idTeacher;
	}
	
	public Integer getIdTeacher() {
		return idTeacher;
	}
	
	public void setIdTeacher(Integer idTeacher) {
		this.idTeacher = idTeacher;
	}
	
	public void addteacherClass(Disciplina item) {
		teacherClass.add(item);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Disciplina dis: teacherClass) {
			sb.append(dis.getName());
		}
		return sb.toString();

	}
	
	
	
	
	
	
}
