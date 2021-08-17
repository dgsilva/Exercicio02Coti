package principal;

import controllers.ClienteController;
import repositories.ClienteRepositoryCSV;
import repositories.ClienteRepositoryTXT;

public class Program {
	
	public static void main(String[] args) {
		ClienteController clienteController = new ClienteController(new ClienteRepositoryCSV());
		
		clienteController.realizarExportacao();
	}

}
