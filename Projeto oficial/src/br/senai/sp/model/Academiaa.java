package br.senai.sp.model;

import java.time.LocalDate;

public class Academiaa {
	
	private String nome;
	private char sexo;
	private double peso;
	private double altura;
	private int niveldeatividade;
	private LocalDate datadenascimento;
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public char getSexo(){
		return this.sexo;
	}
	
	
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso(){
		return this.peso;
	}
	
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public void setNivelDeAtividade(int niveldeatividade) {
		this.niveldeatividade = niveldeatividade;
	}
	
	public double getNivelDeAtividade(){
		return this.niveldeatividade;
	}
	
	
	public void setDataDeNascimento(LocalDate datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	
	public LocalDate getDataDeNascimento() {
		return this.datadenascimento;
	}
	
	public double calcularImc () {
		return (this.peso/(this.altura*this.altura));
	}
	
	
}
