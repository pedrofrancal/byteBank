public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta(123,123456);
		System.out.println(contaDaMarcela.getSaldo());

		contaDaMarcela.setTitular(new Cliente());
		System.out.println(contaDaMarcela.getTitular());

		contaDaMarcela.getTitular().setNome("ana");
		System.out.println(contaDaMarcela.getTitular().getNome());

	}
}