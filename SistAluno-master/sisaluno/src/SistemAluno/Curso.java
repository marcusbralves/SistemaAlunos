package SistemAluno;

import java.util.Collection;

public class Curso {
	private int idCurso;
	private String nomeCurso;
	private Collection<Aluno> alunoCurso;
	private Collection<Disciplinas> diciplinasCurso;
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public Collection<Aluno> getAlunoCurso() {
		return alunoCurso;
	}
	public void setAlunoCurso(Collection<Aluno> alunoCurso) {
		this.alunoCurso = alunoCurso;
	}
	public Collection<Disciplinas> getDiciplinasCurso() {
		return diciplinasCurso;
	}
	public void setDiciplinasCurso(Collection<Disciplinas> diciplinasCurso) {
		this.diciplinasCurso = diciplinasCurso;
	}
	
}
