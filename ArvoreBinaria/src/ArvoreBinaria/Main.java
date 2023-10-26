package ArvoreBinaria;

public class Main {
	public static void main(String[] args) {
        
        No raiz = new No(4);
        Arvore.AdicionarNo(raiz, 2);
        Arvore.AdicionarNo(raiz, 6);
        Arvore.AdicionarNo(raiz, 1);
        Arvore.AdicionarNo(raiz, 3);
        Arvore.AdicionarNo(raiz, 5);
        Arvore.AdicionarNo(raiz, 7);


        System.out.print("EM ORDEM:");
        Arvore.EmOrdem(raiz);
        System.out.print("PRÉ ORDEM:");
        Arvore.PreOrdem(raiz);
        System.out.print("EM NÍVEL:");
        Arvore.EmNivel(raiz);
        System.out.print("POS ORDEM:");
        Arvore.PosOrdem(raiz);
	}
}
