package application;

import entities.Universidade;
import entities.Aluno;
import entities.Disciplina;
import entities.Professor;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		int menu = 0;
		
		Universidade universidade = new Universidade();

		
		while(menu != 4) {
			
			if (menu == 0) {
				System.out.println("DIGITE AS OPÇÕES ABAIXO");
				System.out.println("ADICIONAR PROFESSOR À UNIVERSIDADE [1]");
				System.out.println("ADICIONAR ALUNO À UNIVERDADE [2]");
				System.out.println("EXIBIR INFORMAÇÕES ALUNOS / PROFESSORES [3]");
				System.out.println("SAIR [4]");
			
				menu = sc.nextInt();
				
				if(menu < -1 || menu > 4) {
					System.out.println("OPÇÃO INCORRETA, DIGITAR UMA OPÇÃO VALIDA");
					menu = sc.nextInt();
				}			
			}
								
			
			if (menu == 1) {
				System.out.println("PROFESSOR(A): ");
				String nameTeacher = sc.next();
				
				System.out.println("ANIVERSARIO: ");
				LocalDate birthTeacher = LocalDate.parse(sc.next(),fmt);
				
				System.out.println("ENDEREÇO: ");
				sc.nextLine();
				String addressTeacher = sc.next();
				
				System.out.println("ID PROFESSOR(A)");
				Integer idTeacher = sc.nextInt();
				
				System.out.println("DISCIPLINA");
				String teacherSubjects = sc.next();
				
				System.out.println("ID DISCIPLINA");
				String idsubjectsteacher = sc.next();
		
				Professor Teacher = new Professor(nameTeacher,birthTeacher,addressTeacher,idTeacher);
				Disciplina Disciplina = new Disciplina(teacherSubjects, idsubjectsteacher);
				
				universidade.addTeacher(Teacher);
				Teacher.addteacherClass(Disciplina);		
				
				System.out.println("VOLTAR [0]");
				System.out.println("SAIR [4]");
							
				menu = sc.nextInt();
				
				if (menu != 0 && menu != 4) {
					System.out.println("OPÇÃO INCORRETA, DIGITAR UMA OPÇÃO VALIDA");
					menu = sc.nextInt();
				}	
				
			}
			
			if (menu == 2) {
				System.out.println("ALUNO(A): ");
				String nameStudent = sc.next();
				
				System.out.println("ANIVERSARIO: ");
				LocalDate birthStudent = LocalDate.parse(sc.next(),fmt);
					
				System.out.println("ENDEREÇO: ");
				String addressStudent = sc.next();
				
				
				System.out.println("ID ALUNO(A)");
				Integer idStudent = sc.nextInt();
				
				System.out.println("DISCIPLINA");
				String StudentSubjects = sc.next();
				
				System.out.println("ID DISCIPLINA");
				String idsubjectsStudent = sc.next();
		
				Aluno Student = new Aluno(nameStudent,birthStudent,addressStudent,idStudent);
				Disciplina Disciplina = new Disciplina(StudentSubjects, idsubjectsStudent);
				
				universidade.addStudent(Student);
				Student.addsubjects(Disciplina);
								
				System.out.println("VOLTAR [0]");
				System.out.println("SAIR [4]");
							
				menu = sc.nextInt();
				
				if (menu != 0 && menu != 4) {
					System.out.println("OPÇÃO INCORRETA, DIGITAR UMA OPÇÃO VALIDA");
					menu = sc.nextInt();
				}			
			}	
			
			if (menu == 3) {
				
				System.out.println(universidade.toString());
				
				System.out.println("VOLTAR [0]");
				System.out.println("SAIR [4]");
							
				menu = sc.nextInt();
				
				if (menu != 0 && menu != 4) {
					System.out.println("OPÇÃO INCORRETA, DIGITAR UMA OPÇÃO VALIDA");
					menu = sc.nextInt();
				}				
			}					
	   }
		
		sc.close();
	}
}
