
public class conta_poupanca extends conta {
	public void depositar(double valor) {
	 super.depositar(valor);
	 this.juro();
	}
	
 private void juro() {
	 this.saldo -=1;
 }
}
