package conta.model;

public class contaCorrente extends Conta {

	private float limite;

	public contaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public void vizualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
	
}
