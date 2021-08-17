package repositories;

import java.io.File;
import java.io.PrintWriter;

import entities.Cliente;
import interfaces.IClienteRepository;

public class ClienteRepositoryCSV implements IClienteRepository{

	@Override
	public void exportar(Cliente cliente) throws Exception {
		PrintWriter printWriter = new PrintWriter(new File("F:\\Desenvolvimento Java\\Workspace-CotiSergio21\\temp\\cliente2.csv"));
		printWriter.write(cliente.getIdCliente() + ";" +
		  cliente.getNome()+ ";" +
		  cliente.getEmail()+";"+
		  cliente.getCpf()+ ";"+
		  cliente.getSexo()+";"+
		  cliente.getEstadoCivil());
		printWriter.flush();
		printWriter.close();
		
	}

}
