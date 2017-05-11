package aula.lpII.auxiliar;

public class Arvore {
	private No noRaiz;
	private Arvore leftArvore;
	private Arvore rightArvore;
	
	public No getNoRaiz() {
		return noRaiz;
	}
	public void setNoRaiz(No noRaiz) {
		this.noRaiz = noRaiz;
	}	
	public Arvore getLeftArvore() {
		return leftArvore;
	}
	public void setLeftArvore(Arvore leftArvore) {
		this.leftArvore = leftArvore;
	}
	public Arvore getRightArvore() {
		return rightArvore;
	}
	public void setRightArvore(Arvore rightArvore) {
		this.rightArvore = rightArvore;
	}
	public void inseriNo(No novo, int valor){
		novo = new No(valor);
	}
	public void inseriNoArvore(No novo){
		if(noRaiz == null){
			this.noRaiz = novo;
		}
		else{
			if(novo.getValor() > noRaiz.getValor()){
				if(this.getRightArvore() == null){
					this.rightArvore = new Arvore();
			}
				this.rightArvore.inseriNoArvore(novo);
			}
			else{
				if(novo.getValor() < noRaiz.getValor()){
					if(this.getLeftArvore() == null){
						this.leftArvore = new Arvore();
					}
					this.leftArvore.inseriNoArvore(novo);
				}
			}
		}
	}
	public void imprimeArvore(Arvore v){
		
	}
	
}
