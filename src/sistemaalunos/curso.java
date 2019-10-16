package sistemaalunos;

import java.util.Collection;

public class curso {
	private int idCurso;
	private String nomeCurso;
	private Collection<aluno> alunoCurso;
	private Collection<diciplinas> diciplinasCurso;
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
	public Collection<aluno> getAlunoCurso() {
		return alunoCurso;
	}
	public void setAlunoCurso(Collection<aluno> alunoCurso) {
		this.alunoCurso = alunoCurso;
	}
	public Collection<diciplinas> getDiciplinasCurso() {
		return diciplinasCurso;
	}
	public void setDiciplinasCurso(Collection<diciplinas> diciplinasCurso) {
		this.diciplinasCurso = diciplinasCurso;
	}
	
	

}
