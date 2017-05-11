package aula.lpII.principal;

import aula.lpII.auxiliar.Arvore;
import aula.lpII.auxiliar.No;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arvore tree = new Arvore();
		No no1 = new No(35);
		No no2 = new No(20);
		No no3 = new No(30);
		No no4 = new No(40);
		No no5 = new No(50);
		No no6 = new No(60);
		tree.inseriNoArvore(no1);
		tree.inseriNoArvore(no2);
		tree.inseriNoArvore(no3);
		tree.inseriNoArvore(no4);
		tree.inseriNoArvore(no5);
		tree.inseriNoArvore(no6);
	}

}
