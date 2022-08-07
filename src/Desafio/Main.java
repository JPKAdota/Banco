package Desafio;

public class Main {

    public static void main(String[] args) {
        cliente Kadota = new cliente();
        Kadota.setNome("Kadota");

        conta cc = new contaCorrente(Kadota);
        conta poupança = new contaCorrente(Kadota);

        cc.depositar(100);
        cc.transeferir(100, poupança);

        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }
}
