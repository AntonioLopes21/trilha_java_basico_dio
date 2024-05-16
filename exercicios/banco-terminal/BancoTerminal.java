import java.util.Scanner;

public class BancoTerminal {

    // Numero Inteiro 1021
    // Agencia Texto 067-8
    // Nome Cliente Texto MARIO ANDRADE
    // Saldo Decimal 237.48
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroConta;
        int agencia;
        String nomeCliente;
        Double saldo;

        System.out.println(
                "SISTEMA EM FASE DE TESTES: VALORES DIGITADOS PELO USUARIO COMO: SALDO E NUMERO DE AGENCIA NÃO SÃO VALORES REAIS.");
        System.out.println("Bem vindo ao sistema de banco!");

        System.out.println("Digite o numero da sua conta: (digite 4 numeros)");
        numeroConta = scan.nextInt();

        System.out.println("Agora, digite o numero da sua agencia: 4 digitos sem o traco");
        agencia = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite o seu nome completo:");
        nomeCliente = scan.nextLine();

        System.out.println("Por ultimo, digite o saldo inicial:");
        saldo = scan.nextDouble();

        // TESTE DE RESOLUCAO
        System.out.println("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta +  " e seu saldo " + saldo + " já está disponível para saque\".");
        scan.close();
    }
}
