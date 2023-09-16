package entities;

import java.util.List;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Universidade {
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	List<Aluno> student = new ArrayList<Aluno>();
	List<Professor> teacher = new ArrayList<Professor>();
	List<Disciplina> classes = new ArrayList<Disciplina>();
	
	
	public void addStudent(Aluno item) {
		student.add(item);
	}
	
	public void addTeacher(Professor item) {
		teacher.add(item);
	}
	
	public void addClasses(Disciplina item) {
		classes.add(item);
	}
	
	
	
	
    public void registrationStudent(Disciplina item) {
    	for(Aluno aluno : student) {
    		aluno.addsubjects(item);
    	}	
	}
    
    public void registrationTeacher(Disciplina item) {
    	for(Professor professor : teacher) {
    		professor.addteacherClass(item);
    	}	
	}
    
    public String toString() {
		StringBuilder sb = new StringBuilder();

    	for (Professor item :teacher ) {
    		sb.append("LISTA DE PROFESSORES \n");
    		sb.append("PROFESSOR: " + item.getName() + " ANIVERSARIO: " + fmt.format(item.getBirthDate()) + " DISCIPLINA: " + item.toString() + "\n"); 
    	}
    	
    	for (Aluno item :student ) {
    		sb.append("LISTA DE ALUNOS\n");
    		sb.append("ALUNO: " + item.getName() + " ANIVERSARIO: " + fmt.format(item.getBirthDate()) + " DISCIPLINA: " + item.toString() + "\n"); 
    	}
    	
    	return sb.toString();
    	
    }
    
   
    
    
	
	
	
	

	

}
