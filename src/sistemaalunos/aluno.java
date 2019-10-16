package sistemaalunos;

import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;

public class aluno {
	
	//variavel
	private int registroAluno;
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double media;
	private String status;
	private Collection<diciplinas> diciplinasCursando;
	
	public aluno() {}
	
	public aluno (int registroAluno, String nome, Collection<diciplinas> diciplinasCursando ) {
		this.registroAluno = registroAluno;
		this.nome = nome;
		this.setDiciplinasCursando(diciplinasCursando);
	}
	
	public aluno (int registroAluno, String nome) {
		this.registroAluno = registroAluno;
		this.nome = nome;
		this.diciplinasCursando = new ArrayList<diciplinas>();
		
	}
	
	//propriedades
	public void setRegistroAluno(int ra) {
		this.registroAluno = ra;
	}
	
	public int getRegistroAluno() {
		return registroAluno;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome  = nome;
	}
	
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1  = nota1;
	}
	
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2  = nota2;
	}
	
	public Double getNota3() {
		return nota3;
	}
	public void setNota3(Double nota3) {
		this.nota3  = nota3;
	}
	
	public Double getNota4() {
		return nota4;
	}
	public void setNota4(Double nota4) {
		this.nota4  = nota4;
	}
	
	public String getStatus() {
		
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media  = media;
	}
	
	public Collection<diciplinas> getDiciplinasCursando() {
		return diciplinasCursando;
	}

	public void setDiciplinasCursando(Collection<diciplinas> diciplinasCursando) {
		this.diciplinasCursando = diciplinasCursando;
	}
	
	public void adicionarDicilinas(diciplinas N) {
		this.diciplinasCursando.add(N);
	}
	
	
	public double calcularMedia() {
		media =(nota1+nota2+nota3+nota4)/4;
		if(media>= 7.0)
			status = "Aprovado";
		else
			status = "Reprovado";
		return media;
	}

	

	
}
