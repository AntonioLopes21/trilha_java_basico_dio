package trilha_java_basico_dio.desafios.sintaxe.ContaBanco;

import java.util.Scanner;
// 3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

// *"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*

// Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeUsuario;
        int contaUsuario;
        int agenciaUsuario;
        double saldoUsuario;

        System.out.println("Bem vindo ao sistema de banco! digite o seu nome:");
        nomeUsuario = scan.nextLine();

        System.out.println("agora, digite 4 digitos para sua nova conta:");
        contaUsuario = scan.nextInt();

        System.out.println("agora digite o nome da sua agência com 3 digitos:");
        agenciaUsuario = scan.nextInt();

        System.out.println("por ultimo, digite o seu saldo inicial");
        saldoUsuario = scan.nextDouble();

        System.out.println(
                "Olá " + nomeUsuario + " obrigado por criar uma conta em nosso banco! Sua agência é " + agenciaUsuario
                        + " e sua conta é " + +contaUsuario + " e o seu saldo é de " + saldoUsuario + " reais.");
        scan.close();
    }

}
