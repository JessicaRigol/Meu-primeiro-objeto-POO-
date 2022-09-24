package Praticando;

public class Livro {
	
	String titulo;
	String cor;
	String editora;
	String autor;
	int numeroPags;
	boolean ilustrado;
	boolean ler;
	
	
	void status() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Editora: " + this.editora);
		System.out.println("Paginas: " + this.numeroPags);
		System.out.println("Ilustrado: " + this.ilustrado);
		
	}
	
	void folhearLivro() {
		System.out.println("Folheando...");
		
		
	}
	
	void lerLivro() {
		System.out.println("Lendo...");
		
	}
	
	void fecharLivro() {
		if(ler == true) {
			System.out.println("Termine a leitura antes de fechar");
			
		} else {
			System.out.println("Fechando livro.");
		}
		
		
	}
	

}
