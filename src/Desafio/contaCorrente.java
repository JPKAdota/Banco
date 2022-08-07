package Desafio;

public class contaCorrente extends conta{
    public contaCorrente(Desafio.cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Estrto Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
