package br.senai.sp.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.model.Academiaa;

public class FrameAcademia {
	public void criarTela(){
		
		//Interação
		Academiaa aluno = new Academiaa();
		
		//Construindo a tela
		
		JFrame tela = new JFrame();
		tela.setTitle("Calculos com retangulo");
		tela.setSize(700 , 800);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		// Construindo JLabel Nome
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome: ");
		labelNome.setBounds(20, 20, 60, 30);
		tela.getContentPane().add(labelNome);
		
		//*** Contruir um JTextField Nome
		JTextField textNome = new JTextField();
		textNome.setBounds(70, 20, 250, 30);
		
		//*** Contruindo um Jlabel Altura 
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura: ");
		labelAltura.setBounds(20, 70, 60, 30);
		tela.getContentPane().add(labelAltura);
		
		// *** Construindo um JTextField Altura
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70, 70, 50, 30);
		
		//**** Construindo um JLabel Peso
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso Atual: ");
		labelPeso.setBounds(20, 130, 70, 30);
		tela.getContentPane().add(labelPeso);
		
		//*** Construindo um JTextFiel Peso
		JTextField textPeso = new JTextField();
		textPeso.setBounds(90, 130, 90, 30);
		
		//*** Construindo um sexo 
		
		
		//*** Construindo JLabel Data de Nascimento 
		JLabel labelDataDeNascimento = new JLabel();
		labelDataDeNascimento.setText("Data de nascimento: ");
		labelDataDeNascimento.setBounds(20, 180, 120, 30);
		tela.getContentPane().add(labelDataDeNascimento);
		
		//*** Construindo JText Data de nascimento 
		JTextField textDataDeNascimento = new JTextField();
		textDataDeNascimento.setBounds(150, 180, 100, 30);
		
		
		
		tela.getContentPane().add(labelNome);
		tela.getContentPane().add(textNome);
		tela.getContentPane().add(labelAltura);
		tela.getContentPane().add(textAltura);
		tela.getContentPane().add(labelPeso);
		tela.getContentPane().add(textPeso);
		tela.getContentPane().add(labelDataDeNascimento);
		tela.getContentPane().add(textDataDeNascimento);

		
		tela.setVisible(true);
	}

}
