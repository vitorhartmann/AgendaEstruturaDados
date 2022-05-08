import java.util.ArrayList;
import java.util.Scanner;

public class App extends Contato {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Contato contato = new Contato();
        ArrayList<Contato> contatos = new ArrayList<Contato>();

        int opcao = 0;
        int topo = 0;
        int exclusao = 0;
        int alterar = 0;
        String alteranome;
        String alteratelefone;
        String alteraemail;
        int opcaoaltera = 0;

        while (opcao != 6) {
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
                    // Adicionar contato
                    topo++;
                    contato.setId(topo);
                    System.out.println("Insira o nome do contato");
                    System.out.print("Nome:");
                    contato.setNome(scanner.next());
                    System.out.println("Insira o número");
                    System.out.print("Número:");
                    contato.setTelefone(scanner.next());
                    System.out.println("Insira o endereço de e-mail");
                    System.out.print("E-mail:");
                    contato.setEmail(scanner.next());
                    System.out.println();
                    contatos.add(contato);
                    break;
                case 2:
                    // Alterar contato
                    System.out.println("Insira o id do contato que você deseja alterar");
                    System.out.print("Id:");
                    alterar = scanner.nextInt();
                    System.out.println("\nInsira a opcao que você deseja alterar");
                    System.out.println("opção 1 - Alterar nome");
                    System.out.println("opção 2 - Alterar telefone");
                    System.out.println("opção 3 - Alterar email");
                    System.out.print("Opção:");
                    opcaoaltera = scanner.nextInt();

                    for (int i = topo; i >= alterar; i--) {
                        if (i == alterar) {

                            if (opcaoaltera == 1) {
                                System.out.println("Digite o novo nome.");
                                alteranome = scanner.next();
                                contatos.set((alterar - 1), alteranome);
                                System.out.println("Contato alterar com sucesso\n");
                            } else if (opcaoaltera == 2) {
                                System.out.println("Digite o novo número.");
                                alteratelefone = scanner.next();
                                contatos.set((alterar - 1), alteratelefone);
                                System.out.println("Contato alterar com sucesso\n");
                            } else if (opcaoaltera == 3) {
                                System.out.println("Digite o novo email.");
                                alteraemail = scanner.next();
                                contatos.set((alterar - 1), alteraemail);
                                System.out.println("Contato alterar com sucesso\n");
                            } else {
                                System.out.println("Você digitou uma opção inválida!");
                            }
                        } else {
                            System.out.println("Contato não encontrado. Você digitou um ID inválido!\n");
                        }
                    }

                    break;
                case 3:
                    // Desfazer última alteração do contato

                    break;
                case 4:
                    // Excluir contato
                    System.out.println("Insira o id do contato que você deseja excluir");
                    System.out.print("Id:");
                    exclusao = scanner.nextInt();

                    for (int i = topo; i >= exclusao; i--) {
                        if (i == exclusao) {
                            contatos.remove(exclusao);
                            System.out.println("Contato excluído com sucesso\n");
                        } else {
                            System.out.println("Contato não encontrado. Você digitou um ID inválido!\n");
                        }
                    }
                    break;
                case 5:
                    // Exibir contatos
                    System.out.println();
                    System.out.print(contatos);
                    System.out.println();
                    break;
                case 6:
                    // Sair
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    // Número inválido
                    System.out.println("Você digitou uma opção inválida. Tente novamente.\n");
            }
        }
    }
}
