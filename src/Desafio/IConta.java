package Desafio;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor) ;
    void transeferir(double valor,conta contaDestino);

    void imprimirExtrato();
}
