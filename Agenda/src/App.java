import java.util.ArrayList;
import java.util.Scanner;

import Agenda.src.Contato;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        ArrayList<Contato> contato = new ArrayList<>();

        int opcao = 0;

        while (opcao != 6 ){
            System.out.println("Escolha uma opção");
            System.out.println("opção 1 - Inserir contato");
            System.out.println("opção 2 - Alterar contato");
            System.out.println("opção 3 - Desfazer última alteração do contato");
            System.out.println("opção 4 - Excluir contato");
            System.out.println("opção 5 - Exibir contatos");
            System.out.println("opção 6 - Sair\n");
            

            System.out.print("Opção:");
            opcao = scan.nextInt();
            

            switch (opcao) {
                case 1:
                //
                break;

                case 2:
                //
                break;

                case 3:
                //
                break;

                case 4:
                //
                break;

                case 5:
                //
                break;

                case 6:
                System.out.println("Programa encerrado.");
                break;

                default:
                System.out.println("Você digitou uma opção inválida. Tente novamente.\n");
            }
        }
    }
}
