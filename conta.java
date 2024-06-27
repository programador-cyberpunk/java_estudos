
public class conta {
	protected double saldo;
	public int conta;

	public void sacar(double valor) {
		//primeira opção this.saldo = this.saldo - valor;
		//segunda opção
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
