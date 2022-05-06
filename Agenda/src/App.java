import java.util.ArrayList;
import java.util.Scanner;

import Agenda.src.Contato;

public class App extends Contato{


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        Contato contato = new Contato();
        ArrayList<Contato> contatos = new ArrayList<>();

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
            opcao = scanner.nextInt();
            

            switch (opcao) {
                case 1:
                //Adicionar contato
                
                System.out.println("Insira o nome do contato");
                contato.setNome(scanner.next());

                System.out.println("Insira o número");
                contato.setTelefone(scanner.next());

                System.out.println("Insira o endereço de e-mail");
                contato.setEmail(scanner.next());

                System.out.println();

                contatos.add(contato);

                break;

                case 2:
                //Alterar contato

                break;

                case 3:
                //Desfazer última alteração do contato

                break;

                case 4:
                //Excluir contato

                break;

                case 5:
                //Exibir contatos

                System.out.println();
                System.out.print(contatos.toString());
                System.out.println();
                break;

                case 6:
                //Sair

                System.out.println("Programa encerrado.");
                break;

                default:
                //Número inválido
                System.out.println("Você digitou uma opção inválida. Tente novamente.\n");
            }
        }
    }

}