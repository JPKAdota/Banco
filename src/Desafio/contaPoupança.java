package Desafio;

public class contaPoupança extends conta{
    public contaPoupança(Desafio.cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Poupança ===");
        imprimirInfosComuns();
    }

}
