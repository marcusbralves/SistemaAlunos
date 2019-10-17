package SistemAluno;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import SistemAluno.Aluno;
import SistemAluno.Disciplinas;
import javax.swing.JOptionPane;

public class SistemaDeAlunos {

	public static void main(String[] args) {
		Collection<Disciplinas> disciplina = new ArrayList<Disciplinas>();
		
		
		String[] tmp = null;
		String resposta = null;
		String continuar = "s";
		
		do {
		resposta  = JOptionPane.showInputDialog("Digite a disciplina, Nome e codigo neste formato: RA/NOME/CODIGO");
		tmp = resposta.split("/");
		
		Disciplinas N = new Disciplinas(Integer.parseInt(tmp[0]),tmp[1],Integer.parseInt(tmp[2]));
		disciplina.add(N);
		
		continuar = JOptionPane.showInputDialog("Continuar? (S/N)");
		
		}while(continuar.toLowerCase().equals("s"));
		
		
		String msg = "\n\nDisciplinas Cadastradas\n\n";
		//System.out.println("Diciplinas cadastradas");
		for(Disciplinas N : disciplina) {
			msg += "Id: "+N.getId()+",Nome: "+ N.getNome()+", Curso: "+ N.getCodigoCurso();
		}
		resposta = JOptionPane.showInputDialog("Digite id e nome aluno: id/nome");
		tmp = resposta.split("/");
		Aluno Aluno = new Aluno(Integer.parseInt(tmp[0]),tmp[1]);
		
		resposta = JOptionPane.showInputDialog("Digite id das diciplinsa separados pod virgulas: id/codigo");
		tmp = resposta.split(",");
		for(int i = 0; i< tmp.length;i++) {
				int codigo = Integer.parseInt(tmp[i]);
			for(Disciplinas N : disciplina)
				if(N.getId()==codigo) {
					Aluno.adicionarDicilinas(N);
					break;
				}
			
		}
		System.out.println("O aluno"+ Aluno.getNome()+ " se matriculou nas disciplinas:");
		for(Disciplinas N : Aluno.getDiciplinasCursando()) {
			System.out.println("Id:" + N.getId()+ ",Nome: "+ N.getNome());
		}
		calcularNotas();
		}
	
	
	
	public static void calcularNotas() {
		Aluno aluno = new Aluno();
		List<Aluno> alunos = new  ArrayList<Aluno>();
		
		String tmp = null;
		do {
		
		tmp = JOptionPane.showInputDialog("Nome do aluno?");
		aluno.setNome(tmp);
		
		tmp = JOptionPane.showInputDialog("Registro do aluno");
		aluno.setRegistroAluno(Integer.parseInt(tmp));
		
		tmp = JOptionPane.showInputDialog("Digite nota 1");
		aluno.setNota1(Double.parseDouble(tmp));
		
		tmp = JOptionPane.showInputDialog("Digite nota 2");
		aluno.setNota2(Double.parseDouble(tmp));
		
		tmp = JOptionPane.showInputDialog("Digite nota 3");
		aluno.setNota3(Double.parseDouble(tmp));
		
		tmp = JOptionPane.showInputDialog("Digite nota 4");
		aluno.setNota4(Double.parseDouble(tmp));
		
		aluno.calcularMedia();
		
		tmp = "Aluno:" + aluno.getNome() +", Registro: " + aluno.getRegistroAluno() +"\n\n";
		
		tmp += "Nota1 = " + aluno.getNota1() + "\n";
		tmp += "Nota2 = " + aluno.getNota2() + "\n";
		tmp += "Nota3 = " + aluno.getNota3() + "\n";
		tmp += "Nota4 = " + aluno.getNota4() + "\n";
		tmp += "Media = " + aluno.getMedia() + "\n\n";
		tmp += "Voc� est� " + aluno.getStatus();
		
		
		
		JOptionPane.showMessageDialog(null, tmp);
		
		
		
		tmp = JOptionPane.showInputDialog("Teria mais alunos para inserir (S/N?");	
		}while(tmp.toLowerCase().equals("s"));
		
		int confirm = JOptionPane.showConfirmDialog(null, "Deseja Vê relatorio de alunos?");
		
		alunos.add(aluno);
		if(confirm == 0) {	
			System.out.println(alunos);
			JOptionPane.showMessageDialog(null, alunos);
			for (Aluno aluno2 : alunos) {
				
				
			}	
		}
		
		System.exit(0);
	}
	
	
	}


