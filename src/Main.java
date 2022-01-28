
public class Main {

	public static void main(String[] args) {
		
		Cliente guilherme = new Cliente();
		guilherme.setNome("Guilherme Amorim");
		
		Conta cc = new ContaCorrente(guilherme);
		Conta poupanca = new ContaPoupanca(guilherme);
		
		cc.depositar(2000);
		cc.transferir(180, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
