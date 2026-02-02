package q3;
import java.util.Scanner;

public class Menu {
	private Scanner sc = new Scanner(System.in);
    private JogoLogica jogar = new JogoLogica();
    private int opcao;
    private boolean matrizPreenchida = false;

    public void iniciar() {

        System.out.println("███╗   ███╗ █████╗ ████████╗██████╗ ██╗██╗  ██╗");
        System.out.println("████╗ ████║██╔══██╗╚══██╔══╝██╔══██╗██║╚██╗██╔╝");
        System.out.println("██╔████╔██║███████║   ██║   ██████╔╝██║ ╚███╔╝ ");
        System.out.println("██║╚██╔╝██║██╔══██║   ██║   ██╔══██╗██║ ██╔██╗ ");
        System.out.println("██║ ╚═╝ ██║██║  ██║   ██║   ██║  ██║██║██╔╝ ██╗");
        System.out.println("╚═╝     ╚═╝╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝");
        System.out.println();
        System.out.println(" ██████╗ ██╗   ██╗███████╗███████╗████████╗");
        System.out.println("██╔═══██╗██║   ██║██╔════╝██╔════╝╚══██╔══╝");
        System.out.println("██║   ██║██║   ██║█████╗  ███████╗   ██║   ");
        System.out.println("██║▄▄ ██║██║   ██║██╔══╝  ╚════██║   ██║   ");
        System.out.println("╚██████╔╝╚██████╔╝███████╗███████║   ██║   ");
        System.out.println(" ╚══▀▀═╝  ╚═════╝ ╚══════╝╚══════╝   ╚═╝   ");

        System.out.println("==============================================");
        System.out.println("              🎮 PRESS START 🎮              ");
        System.out.println("==============================================");
        System.out.println("PRESSIONE QUALQUER TECLA E ENTER PARA INICIAR");
        System.out.println("==============================================");
        sc.nextLine();

        do {
            System.out.println("========= MENU =========");
            System.out.println("1 - Preencher a matriz");
            System.out.println("2 - Corrigir algum número");
            System.out.println("3 - Conferir resultado");
            System.out.println("4 - Novo Jogo");
            System.out.println("0 - Sair");
            System.out.println("========================");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
            	case 1:
            		if (matrizPreenchida) {
            			jogar.zerarMatriz();
            			System.out.println("Matriz anterior apagada. Novo jogo iniciado!");
            		}
            		jogar.colherDados();
            		matrizPreenchida = true;
                	break;
                case 2:
                    if (matrizPreenchida) {
                        jogar.corrigirDigito();
                    } else {
                        System.out.println("A matriz ainda está vazia!");
                        System.out.println("Preencha a matriz antes de corrigir números!");
                    }
                    break;

                case 3:
                    if (matrizPreenchida) {
                        jogar.conferirResultadoMatriz();
                    } else {
                        System.out.println("A matriz ainda está vazia!");
                    }
                    break;
                
                case 4:
                    jogar.novoJogo();
                    matrizPreenchida = false;
                    System.out.println("Novo jogo iniciado!");
                    System.out.println("A matriz foi resetada e um novo número foi sorteado.");
                    break;

                case 0:
                    System.out.println("Jogo encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
        sc.close();
    }

}
