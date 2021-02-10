package vetores;

public class Vetor {

	public static void main(String[] args) {
		double notas[] = {8.5, 9.3, 7.2, 9.7};
		
		System.out.println("Media das notas é = " + media (notas));
		System.out.println("Soma das notas é = " + soma (notas));
		
		//int mediaNotas = 0;
		//for (int i = 0; i < notas.length; i++) {
		//mediaNotas += notas [i];
		//}
		//double totalNotas = mediaNotas / notas.length;
		
		
		
		
		//double media = (notas[0] + notas[1] + notas[2] + notas[3]) /4;
		 //System.out.println("Média=  " +media);
		 
	
		 // media = (notas[0] + notas[1] + notas[2] + notas[3]) /4; //tira o douvle pq não está criando
		  
		  //System.out.println("Média=  " +media); //exibe na tela 
	
		  
		  //System.out.println("Nota do 4Bim=  " + notas[3]);
		  
		 // notas[4] = 10;
		  
		  double idades[] = {46, 17, 17, 16, 
				  17, 17, 17, 16,
				  17, 22, 17, 19,
				  16, 16, 17, 16, 16};
		  
		  
	
		  System.out.println ("Media das Idades é = " + media (idades)); 
		  System.out.println ("Soma das Idades é = " + soma (idades)); 
		  
		  
		  
		  
		  double pesos[] = {65, 89, 50, 48, 100, 65, 78, 54}; 
			
			System.out.println ("Soma dos pesos é = " + soma(pesos)); 
	
		  
		  String[] nomes = {"Ana" , "Pedro", "Fabiana" , "Luiz"};
		  
		  for (int i = 0; i <nomes.length; i++) {
			  System.out.println(nomes [i]);
		  }
		  
			
		  }
		  
		  
	
			
	
		 // int mediaIdades = 0;
		  
		 // String nome = "Beatriz";
		 // int repeticao = 10; //numero max de volta que vai dar 
		  
		  //for (int i = 0; i < repeticao; i++ ) { // i é onde a volta está 
			  // int i = 0 =  controle de voltas  < repetidor = condição boleana    i++ = aculador (1)
			  
			  //System.out.println(i+ "-" +nome);
			  
			  //System.out.println(idades.length); //saber o tamanho do array
			  
			  
			  
			  
			  // DESAFIO: SOMA DAS IDADES USANDO O FOR 	
			  
			 // int somaIdades = 0;
			  
			 // for (int i = 0; i < idades.length; i++) {
			//	  somaIdades += idades [i];
			 // }
					  
			  //double totalIdades = somaIdades / idades.length;
			  
			 // System.out.println("Média das idades é = " + totalIdades);
		 // }
	
		private static double media (double vetor[]) {
			double soma = 0;
			
			for (int i = 0; i < vetor.length; i++) {
				soma += vetor [i];
			}
			
			return soma / vetor.length;
		}
		
		
		private static double soma (double vetor[]) {
			double soma = 0;
			
			for (int i = 0; i < vetor.length; i++) {
				soma += vetor [i];
			}
			
			return soma ;
		}


}

