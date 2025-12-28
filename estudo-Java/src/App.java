package src;

import src.model.ContaBancaria;
import src.model.ContaPoupanca;
import src.model.Movimentacao;
import src.utils.DataUtil;

public class App {

    public static void main(String[] args) {
        System.out.println("criando nosso banco digital");
        System.out.println();

        ContaPoupanca conta = new ContaPoupanca("0001", "12345-6", 2, 100.0);

        System.out.println("Saldo da conta de R$" + conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);

        System.out.println("Saldo da conta de R$" + conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(150.0);
        System.out.println("Saldo da conta de R$" + conta.getSaldo());
        System.out.println();

        ContaPoupanca conta2 = new ContaPoupanca("0001", "12345-2", 4, 200.0);

        conta2.transferir(100.0, conta);
        System.out.println("Saldo da conta de R$" + conta2.getSaldo());
        System.out.println();
        System.out.println("Saldo da conta de R$" + conta.getSaldo());

        DataUtil util = new DataUtil();

        var formatado = util.converteDateParaDataEHora(conta.getDataAbertura());

        System.out.println(formatado);

        // Extrato bancario é composto por movimentações bancarias.
        // ter algo que possa ser a movimentação.
        // Ter uma lista de movimentações dentro da conta bancaria.

        Movimentacao movi = new Movimentacao("Saque", 100.0);

        System.out.println(movi);

        movi.toString();
        
    }
}