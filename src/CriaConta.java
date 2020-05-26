public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(123,123456);
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new Conta(456,654321);
        segundaConta.deposita(50);

        System.out.println("primeira tem " + primeiraConta.getSaldo());
        System.out.println("segunda tem " + segundaConta.getSaldo());

        System.out.println("referencia " + primeiraConta);
    }

}