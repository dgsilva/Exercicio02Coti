package controllers;

import entities.Cliente;
import inputs.ClienteInput;
import interfaces.IClienteRepository;

public class ClienteController {

	private IClienteRepository iClienteRepository;

	public ClienteController(IClienteRepository iClienteRepository) {
		super();
		this.iClienteRepository = iClienteRepository;
	}
	
	public void realizarExportacao() {
		System.out.println("\n Exportação de dados de cliente.");
		System.out.println("Exercicio - Javadeveloper FullStack coti informática");
		
		try {
			Cliente cliente = new Cliente();
			cliente.setIdCliente(ClienteInput.lerIdCliente());
			cliente.setNome(ClienteInput.lerNome());
			cliente.setCpf(ClienteInput.lerCpf());
			cliente.setEmail(ClienteInput.lerEmail());
			cliente.setSexo(ClienteInput.lerSexo());
			cliente.setEstadoCivil(ClienteInput.lerEstadoCivil());
			
			System.out.println("\nDados do cliente: " + cliente.toString());
			
			System.out.println("\n INICIANDO A EXPORTAÇÃO.");
			
			iClienteRepository.exportar(cliente);
			
			 
			System.out.println("\n Exportação finalizada com sucesso.");
			
		}catch (Exception e) {
			System.out.println("Erro: " +e.getMessage());
		}
		
		
	}
}
