
public class conta {
	protected double saldo;
	public int conta;

	public void sacar(double valor) {
		//primeira op��o this.saldo = this.saldo - valor;
		//segunda op��o
		if(this.saldo>=valor) {
			this.saldo -= valor;
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	public void verSaldo() {
		System.out.println("Saldo = " + this.saldo);
	}
}
