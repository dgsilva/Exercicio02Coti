package entities;

import enums.EstadoCivil;
import enums.Sexo;

public class Cliente {
	
	private Integer idCliente;
	private String nome;
	private String email;
	private String cpf;
	private Sexo sexo;
	private EstadoCivil estadoCivil;
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", sexo="
				+ sexo + ", estadoCivil=" + estadoCivil + "]";
	}
	
	
	

}
