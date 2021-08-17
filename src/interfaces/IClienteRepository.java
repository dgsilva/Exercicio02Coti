package interfaces;

import entities.Cliente;

public interface IClienteRepository {

	public void exportar(Cliente cliente) throws Exception;
}
