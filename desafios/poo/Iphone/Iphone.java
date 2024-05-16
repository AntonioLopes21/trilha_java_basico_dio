package trilha_java_basico_dio.desafios.poo.Iphone;

import java.util.Scanner;

// ###### Comportamentos esperados:
// * Repodutor Musicial: tocar, pausar, selecionarMusica
// * Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
// * Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina
public class Iphone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo ao seu Iphone!");

        System.out.println(
                "digite uma das opções abaixo:\n1 - reprodutor musical\n2 - telefônico\n3 - navegar na internet");
        int opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.println("opcao 1 - reprodutor musical");
            int i = 0;
            while (i == 0) {
                System.out.println("1-tocar\n2-pausar\n3-selecionar musica");
                int outraOpcao = scan.nextInt();

                if (outraOpcao == 1) {
                    tocar();
                }
                if (outraOpcao == 2) {
                    pausar();
                }
                if (outraOpcao == 3) {
                    selecionarMusica();
                } else {
                    i = 1;

                }
            }
        }

        if (opcao == 2) {
            System.out.println("opcao 2: telefônico");
            int i = 0;
            while (i == 0) {
                System.out.println("1-ligar\n2-atender\n3-iniciar correio de voz");
                int outraOpcao = scan.nextInt();

                if (outraOpcao == 1) {
                    ligar();
                }
                if (outraOpcao == 2) {
                    atender();
                }
                if (outraOpcao == 3) {
                    iniciarCorrerioVoz();
                } else {
                    i = 1;

                }
            }
        }

        if (opcao == 3) {
            System.out.println("opcao 3 - navegar na internet");
            int i = 0;
            while (i == 0) {
                System.out.println("1-exibir pagina\n2-atualizar pagina\n3-adicionar nova aba");
                int outraOpcao = scan.nextInt();

                if (outraOpcao == 1) {
                    exibirPagina();
                }
                if (outraOpcao == 2) {
                    atualizarPagina();
                }
                if (outraOpcao == 3) {
                    adicionarNovaAba();
                } else {
                    i = 1;

                }
            }
        }
    }

    public static void tocar() {
        System.out.println("você está tocando uma musica agora.");
    }

    public static void pausar() {
        System.out.println("agora a musica esta pausada");
    }

    public static void selecionarMusica() {
        System.out.println("selecionar musica");
    }

    public static void ligar() {
        System.out.println("você está ligando para...");
    }

    public static void atender() {
        System.out.println("voce acabou de atender uma ligacao");
    }

    public static void exibirPagina() {
        System.out.println("bem vindo a pagina do google");
    }

    public static void atualizarPagina() {
        System.out.println("você está atualizando uma página");
    }

    public static void adicionarNovaAba() {
        System.out.println("você está adicionando uma aba");
    }

    public static void iniciarCorrerioVoz() {
        System.out.println("correio de voz");
    }

}
