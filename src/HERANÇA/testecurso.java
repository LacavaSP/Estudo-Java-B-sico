package HERANÇA;

import java.util.Scanner;

public class testecurso {

	public static void main(String[] args) {
	 
		Scanner entrada = new Scanner(System.in);
		Aluno[] alunos = new Aluno[5];
		Professor professor = new Professor();
		Curso curso = new Curso();
		
System.out.print("Entre com o nome do curso: ");
curso.setNomecurso(entrada.next());
System.out.print(".Entre com o horário do curso: ");
curso.setHorariodocurso(entrada.next());
System.out.println("Entre com o nome do professor do curso: ");
professor.setNomedoprofessor(entrada.next());
System.out.println("Entre com o email do professor do curso: ");
professor.setEmaildoprofessor(entrada.next());
System.out.println("Entre com o departamento do professor do curso: ");
professor.setDepartamento(entrada.next());

for(int i=0;i<alunos.length;i++) {
	Aluno a = new Aluno();
	System.out.println("Entre com o nome do aluno " + i);
	a.setNomedoaluno(entrada.next());
	System.out.println("Entre com a matrícula do aluno " + i);
	a.setMatriculadoaluno(entrada.nextLong());
	
	System.out.println("Entre com as 4 notas do aluno: " + i);
	a.setNota1(entrada.nextInt());
	a.setNota2(entrada.nextInt());
	a.setNota3(entrada.nextInt());
	a.setNota4(entrada.nextInt());
	alunos[i] = a;
	}
curso.setProfessor(professor);
curso.setAlunos(alunos);
curso.exibirmedia();
	}

}

