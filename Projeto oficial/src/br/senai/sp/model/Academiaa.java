package br.senai.sp.model;

import java.time.LocalDate;
import java.time.Period;

public class Academiaa {
	
	private String nome;
	private char sexo;
	private double peso;
	private double altura;
	private int niveldeatividade;
	private LocalDate datadenascimento;
	private String statusimc;
	private double ncd;
	
	
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
	
	public void setStatusImc(String statusimc) {
		this.statusimc = statusimc;
	}
	
	public String getStatusImc() {
		return this.statusimc;
	}
	
	public void setNcd(double ncd) {
		this.ncd = ncd;
	}
	
	public double getNcd() {
		return this.ncd;
	}
	
	
	
			// CALCULOS IDADE DO ALUNO 
	
	public int getIdade () {
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(this.datadenascimento, hoje);
		
		return periodo.getYears();

	}
	
		// CALCULO IMC DO ALUNO
	
	public double getImc() {
		return this.peso / (altura*altura);
		
	}
	
	public String getResultadoImc() {
		if (this.getImc() <18.5) {
			return "Abaixo do peso";
		} else if (this.getImc() >18.5 && this.getImc() < 25) {
			return "Peso ideal (Parab�ns)";
		}else if (this.getImc() >= 25 && this.getImc() < 30) {
			return "Levemente Acima do Peso";
		}else if (this.getImc() >= 35 && this.getImc() < 35) {
			return "Obesidade I Grau";
		}else if (this.getImc() >= 35 && this.getImc() < 40) {
			return "Obesidade II Grau";
		}else {
			return "Obeidade III Grau";
		}
	}
	
		// CALCULAR O NCD MULHER
	public double getCalcularNcd() {
		double ncd = 0;
		
		if (this.sexo == 'F') {
			
			//Com base na idade 
			
		if (this.getIdade() > 18 && this.getIdade() < 31) {
			ncd = 14.7 * this.peso + 496;
		}else if (this.getIdade() >= 31 && this.getIdade() <= 60) {
			ncd = 8.7 * this.peso + 829;
		}else {
			ncd = 10.5 * this.peso + 596;
		}
		
	
		//Com base na atividade
		
		if (this.niveldeatividade == NivelDeAtividade.LEVE) {
			ncd = 1.6;
		} else if (this.niveldeatividade == NivelDeAtividade.MODERADO) {
			ncd = 1.6;
		}else if (this.niveldeatividade == NivelDeAtividade.INTENSO) {
			ncd = 1.8;
		}
		
		
		return ncd;
		
		}
	}
	
	// NCD HOMEM
	
	public double getCalcularNcd1() {
		double ncd = 0;
		
		if(this.sexo == 'M') {
			
			// De acordo com a idade 
			
			if (this.getIdade() > 18 && this.getIdade() < 31) {
				ncd = 15.3 * this.peso + 679;
			}else if (this.getIdade() >= 31 && this.getIdade() <= 61) {
				ncd = 11.6 * this.peso + 879;
			}else {
				ncd = 13.5 * this.peso + 487;
			}
			
			// De acordo com o nivel de atividade
			
				if(this.niveldeatividade == NivelDeAtividade.LEVE1) {
					ncd = 1.5;
				}else if (this.niveldeatividade == NivelDeAtividade.MODERADO1) {
					ncd = 1.8;
				}else if (this.niveldeatividade == NivelDeAtividade.INTENSO1) {
					ncd = 2.1;
				}
				
				return ncd;
		}
	}
}
