package HERANÇA;

public class Curso {

	private String nomecurso;
	private String horariodocurso;
	private Professor professor;
	private Aluno alunos[];
	
//----------------------------------------------------------------------------------------------------------------------------------------	
public String getNomecurso() {
		return nomecurso;
}
	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}
	public String getHorariodocurso() {
		return horariodocurso;
	}
	public void setHorariodocurso(String horariodocurso) {
		this.horariodocurso = horariodocurso;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
//----------------------------------------------------------------------------------------------------------------------------------------	

public void exibirmedia() {
	double aux = 0;
	double mediaturma = 0;
	for (Aluno notas:alunos) {
		
	double media = (notas.getNota4() + notas.getNota3() + notas.getNota2() + notas.getNota1())/4;
	System.out.print("O aluno " + notas.getNomedoaluno() + " obteve a seguinte média na matéria de " + professor.getDepartamento() + " " + media +"\n");
	if(media > 7) { System.out.println("Portanto ele foi aprovado");}else {System.out.println("Portanto ele foi reprovado");}
	aux +=media;
	}
	
	mediaturma = aux/5;
	System.out.println("A media da turma foi de " + mediaturma + " pontos");
}
	
	
}




