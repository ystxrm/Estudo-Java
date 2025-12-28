package src.model;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String agencia, String numeroConta, Integer digito, Double saldoInicial) {
        // aqui por baixo ele cria uma conta bancaria normal.
        super(agencia, numeroConta, digito, saldoInicial);

    }

}
