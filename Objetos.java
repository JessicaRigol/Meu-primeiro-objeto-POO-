package Praticando;

public class Objetos {

	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.titulo = "Gotico Botanico";
		l1.cor = "Verde";
		l1.editora = "Wish";
		l1.autor = "Varios";
		l1.numeroPags = 256;
		l1.ilustrado = true;
		l1.ler = true;
		
		l1.status();
		l1.folhearLivro();
		l1.lerLivro();
		l1.fecharLivro();
		
		
		

	}

}
