package conta.model;

public class ContaPoupanca extends Conta {

	private int aniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	public float getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	public void vizualizar() {
		super.visualizar();
		System.out.println("Dia do Aniversario da Conta: " + this.aniversario);
	}
}