package src.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {
    // #region Atributos
    private String agencia;

    private String numeroConta;

    private Integer digito;

    private Double saldo;

    private Date dataAbertura;

    private ArrayList<Movimentacao> movimentacoes;

    private double VALOR_MINIMO_DEPOSITO = 10.0;

    // #endregion

    // #region Construtores
    public ContaBancaria(String agencia, String numeroConta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();

        // Se nao instaciar, vai dar uma exception de NullPointerExecption
        this.movimentacoes = new ArrayList<Movimentacao>();
        // Crie a primeira movimentação.
        Movimentacao movimentacao = new Movimentacao("abertura de conta", saldoInicial);

        // Aqui estou salvando a movimentação dentro do meu array de movimentações.
        // Aqui estou iniciando o meu extrato bancario.
        this.movimentacoes.add(movimentacao);
    }
    // #endregion

    // #region Getters e Setters

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    // #endregion

    // #region Metados

    public void depositar(Double valor) {
        // Verifica se o valor de deposito e menor que o valor minimo.
        // Se for não pode acontecer o deposito.
        if (valor < VALOR_MINIMO_DEPOSITO) {
            throw new InputMismatchException("Valor minimo para deposito e de R$ " + VALOR_MINIMO_DEPOSITO);
        }
        // efetua o deposito somando o valor ao saldo.
        this.saldo += valor;

        // Aqui faço uma movimentação no extrato.
        Movimentacao movimentacao = new Movimentacao("Deposito", valor);
        this.movimentacoes.add(movimentacao);
    }

    public Double sacar(Double valor) {
        // verifica se o valor do saque e maior que o saldo.
        // se for manda mensagem de saldo insuficiente.
        if (valor > this.saldo) {
            throw new InputMismatchException("Saldo insuficiente para saque");
        }
        // aqui removemos o valor de saque ao saldo atual.
        this.saldo -= valor;

        Movimentacao movimentacao = new Movimentacao("Retirada de valor!", valor);
        this.movimentacoes.add(movimentacao);

        // aqui retornamos o valor sacado.
        return valor;
    }

    public void transferir(Double valor, ContaBancaria contaDestino) {

        this.sacar(valor);

        contaDestino.depositar(valor);
    }
    // #endregion

}
