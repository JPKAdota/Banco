package Desafio;

public class contaCorrente extends conta{
    private static int SEQUENCIAL =1;

    public contaCorrente(){
        super.agencia = conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }
}
