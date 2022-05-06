import java.util.ArrayList;
import java.util.Scanner;

public class App extends Contato{

    public void push (Contato contato){
        
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

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
            opcao = scanner.nextInt();
            

            switch (opcao) {
                case 1:
                //

                Contato contatos = new Contato();
                
                System.out.println("Insira o nome do contato");
                contatos.setNome(scanner.next());

                System.out.println("Insira o número");
                contatos.setTelefone(scanner.next());

                System.out.println("Insira o endereço de e-mail");
                contatos.setEmail(scanner.next());

                System.out.println();

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