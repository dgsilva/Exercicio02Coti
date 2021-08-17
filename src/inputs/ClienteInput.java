package inputs;

import javax.swing.JOptionPane;

import enums.EstadoCivil;
import enums.Sexo;

public class ClienteInput {

	public static Integer lerIdCliente() throws Exception {

		Integer value = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID do Cliente"));
		if (value <= 0)
			throw new Exception("\nO ID o Cliente deve  ser maior do que zero.");
		return value;
	}

	public  static String lerNome() throws Exception {

		String value = JOptionPane.showInputDialog("Entre  com NOME do cliente:");

		if (value.trim().length() >= 6)
			throw new Exception("O NOME o cliente deve conter no minimo 6 caracteres.");
		return value;
	}
	
	public  static String lerEmail() throws Exception {

		String value = JOptionPane.showInputDialog("Entre  com Email do cliente:");

		if (value.length() == 11)
			throw new Exception("O EMAIL o cliente deve conter no minimo 11 caracteres.");
		return value;
	}

	public static String lerCpf() throws Exception {

		String value = JOptionPane.showInputDialog("Entre  com CPF do cliente:");

		if (value.length() == 0)
			throw new Exception("O CPF o cliente deve conter 11 caracteres.");
		return value;
	}

	public static Sexo lerSexo() throws Exception {

		Integer value = Integer.parseInt(JOptionPane.showInputDialog("Informe (1) Feminino ou (2)Masculino"));

		switch (value) {
		case 1:
			return Sexo.FEMININO;
		case 2:
			return Sexo.MASCULINO;

		default:
			throw new Exception("Sexo invalido");
		}
	}

	public static EstadoCivil lerEstadoCivil() throws Exception {

		Integer value = Integer
				.parseInt(JOptionPane.showInputDialog("Informe (1) Solteiro, (2)Casado,(3)Divorciado ou (4)Viuvo"));

		switch (value) {
		case 1:
			return EstadoCivil.SOLTEIRO;
		case 2:
			return EstadoCivil.CASADO;
		case 3:
			return EstadoCivil.DIVORCIADO;
		case 4:
			return EstadoCivil.VIUVO;
		default:
			throw new Exception("Estado civil invalido");

		}
	}
}
