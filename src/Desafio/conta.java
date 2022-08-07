package Desafio;

public abstract class conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;



    public void sacar() {

    }

    public void depositar() {

    }
    public void transferir() {

    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transeferir(double valor, conta conaDestino) {

    }
}
