public class TestaBanco {
	public static void main(String[] args) {
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro");
		pedro.setCpf("123456789");
		pedro.setProfissao("estudante");

		Conta contaPedro = new Conta(315,123456);
		contaPedro.deposita(100);

		contaPedro.setTitular(pedro);
		System.out.println(contaPedro.getTitular().getNome());
		System.out.println(contaPedro.getTitular());

	}
}