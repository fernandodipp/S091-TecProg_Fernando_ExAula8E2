package metodoFacade;

public class ModuloDisparoEmail {
	
	public void dispararEmail(Produto produto) {
		System.out.println("ModuloDisparoEmail: Disparando email para o endereço: " 
				+ produto.emailComprador + ", aos cuidados de: " + produto.nomeComprador);
	}

}
