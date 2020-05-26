public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta(123,123456);
		conta.deposita(100);
		conta.deposita(50);
		System.out.println(conta.getSaldo());

		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta conta2 = new Conta(321,654321);
		conta2.deposita(1000);

		boolean sucessoTransferencia = conta2.transfere(300, conta);

		if (sucessoTransferencia) {
			System.out.println("transferido com sucesso");

		} else {
			System.out.println("falta dinheiro");

		}
		System.out.println(conta2.getSaldo());
		System.out.println(conta.getSaldo());
	}

}