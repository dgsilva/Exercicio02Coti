package repositories;

import java.io.File;
import java.io.PrintWriter;

import entities.Cliente;
import interfaces.IClienteRepository;

public class ClienteRepositoryTXT implements IClienteRepository {

	@Override
	public void exportar(Cliente cliente) throws Exception {
		PrintWriter printWriter = new PrintWriter(new File("F:\\Desenvolvimento Java\\Workspace-CotiSergio21\\temp\\cliente2.txt"));
		printWriter.write("ID........: " + cliente.getIdCliente());
		printWriter.write("Nome......: " + cliente.getNome());
		printWriter.write("Email......: " + cliente.getEmail());
		printWriter.write("CPF......: " + cliente.getCpf());
		printWriter.write("Sexo......: " + cliente.getSexo());
		printWriter.write("Estado Civil......: " + cliente.getEstadoCivil());
		printWriter.flush();
		printWriter.close();
		
	}
	
	

}
