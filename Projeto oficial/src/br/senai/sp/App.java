package br.senai.sp;

import java.time.LocalDate;

import br.senai.sp.gui.FrameAcademia;
import br.senai.sp.model.Academiaa;
import br.senai.sp.model.NivelDeAtividade;

public class App {

	public static void main(String[] args) {
//		Academiaa ana = new Academiaa();
//		ana.setNome("Ana Maria");
//		ana.setSexo("F");
//		ana.setPeso("75");
//		ana.setAltura("1.60");
//		ana.setDataDeNascimento(LocalDate.of(2003, 10, 2));
//		ana.setNivelDeAtividade(NivelDeAtividade.MODERADO);
//		
//		System.out.println("" + ana.getNome() + "");
//		System.out.println("IMC: " + ana.getImc());
//		System.out.println("Situação: " + ana.getStatusImc());
//		System.out.println("Idade: " + ana.getIdade());
//		System.out.println("NCD: " + ana.getNcd());
		
		FrameAcademia tela = new FrameAcademia();
		tela.criarTela();

	}

}
