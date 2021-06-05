package br.com.impacta.lab;

public class Conta {

    private int numero;
	private int agencia;
	private String tipo;

	public Conta( int numero, int agencia, String tipo) {
	    this.numero = numero;
	    this.agencia = agencia;
	    this.tipo = tipo;
    }

	public int getNumero() {
		return this.numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public String getTipo() {
		return this.tipo;
	}

	public String montarResumoDaConta() {
		return " - Numero: " + this.getNumero() + " - Agencia: " + this.getAgencia() + " - Tipo: " + this.getTipo();
    }
}
