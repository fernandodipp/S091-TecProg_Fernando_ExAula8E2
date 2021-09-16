package metodoFacade;

public class Main {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.id = 123;
		produto.nomeProduto = "Cápsula de café";
		produto.precoProduto = 27;
		produto.nomeComprador = "Fulano de Tal";
		produto.emailComprador = "fulano.tal@estudante.senai.edu.br";
		
		ProdutoFacade produtoFacade = new ProdutoFacade();
		produtoFacade.comprarProduto(produto);
		

	}

}
