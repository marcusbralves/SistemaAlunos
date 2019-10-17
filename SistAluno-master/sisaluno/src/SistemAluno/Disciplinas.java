package SistemAluno;

public class Disciplinas {
	private int id;
	private String nome;
	private int codigoCurso;
	
	//contrutores
	public Disciplinas() {
		this.id = 0;
		this.nome = "Sem nome";
		this.codigoCurso = 0;
		
	}
	
	public Disciplinas(int id, String nome, int codigoCurso) {
		this.id = id;
		this.nome = nome;
		this.codigoCurso = codigoCurso;
		
	}
	
	public Disciplinas(int id, String nome) {
		this.id = id;
		this.nome = nome;
		this.codigoCurso = 0;
		
	}
	public Disciplinas(String nome) {
		this.nome = nome;
		this.codigoCurso = this.id = 99;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; 
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public int getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
}
