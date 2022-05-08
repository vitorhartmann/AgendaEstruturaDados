import java.util.ArrayList;
import java.util.Scanner;
import Pilha.PilhaVaziaException;




public class Cliente {
    static ArrayList<Contato> listaContatos = new ArrayList<>(); 
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao = 0;

       
        do {
            System.out.println("   Agenda de Contatos     ");
            System.out.println("      Opções           ");
            System.out.println(" 1 - Visualizar Contatos ");
            System.out.println(" 2 - Inserir Contato  ");
            System.out.println(" 3 - Editar Contato   ");
            System.out.println(" 4 - Sair             ");
            System.out.println("---------------------");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1:
                    visualizarLista();
                    break;
                case 2:
                    inserirContato();
                    break;
                case 3:
                    if (listaContatos.isEmpty()) {
                        System.out.println("Lista de contatos vazia.");
                        System.out.print("Confirme para voltar ao menu ");
                        scan.nextLine();
                        
                    } else {
                        editarContato();
                    }
                    break;
                case 4:
                    System.out.println("Finalizando Programa");
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }

        } while (opcao != 4);

        scan.close();
    }

    
    public static void visualizarLista() {
        
        System.out.println(" 1 - Visualizar lista ");

        if (!listaContatos.isEmpty()) {
            listaContatos.forEach(contato -> System.out.println(contato + System.lineSeparator()));
        } else {
            System.out.println("Lista Vazia!\n");
        }

        System.out.print("Confirme para voltar ao menu ");
        scan.nextLine();
      
    }
    
    public static void inserirContato() {
        String nome, email, telefone, resp;
        Contato contato;
        boolean sair = false;

      
        System.out.println(" 2 - Inserir Contato ");
        System.out.print("Informe o nome do contato: ");
        nome = scan.nextLine();
        System.out.print("Informe o telefone do contato: ");
        telefone = scan.nextLine();
        System.out.print("Informe o email do contato: ");
        email = scan.nextLine();

        do {
            System.out.println(" Contato ");
            System.out.println("Nome: " + nome);
            System.out.println("Telefone: " + telefone);
            System.out.println("Email: " + email);
            System.out.println("");
            System.out.print("Salvar Contato? (S/N) ");
            resp = scan.nextLine();
            
            if (resp.toUpperCase().equals("S")) {
                contato = new Contato(nome, telefone, email);
                listaContatos.add(contato);
                sair = true;
            } else if (resp.toUpperCase().equals("N")) {
                System.out.println("Revertendo alterações");
                sair = true;
            } else {
                System.out.println("Comando Invalido");
            }
        } while (!sair);
        

    }

    private static void editarContato() {
        
        int opcao;
        Contato contato;

        do {
            System.out.println(" 3 - Editar Contato ");
            System.out.println(" 1 - Editar Dados do Contato      ");
            System.out.println(" 2 - Voltar Versão                ");
            System.out.println(" 3 - Excluir Contato              ");
            System.out.println(" 4 - Voltar ao Menu               ");
            System.out.println("");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1:
                    contato = getContato();
                    if (contato != null) {
                        
                        editarDados(contato);
                    }

                    opcao = 4;
                    break;
                case 2:
                    contato = getContato();
                    if (contato != null) {
                        
                        voltarVersao(contato);
                    }

                    opcao = 4;
                    break;
                case 3:
                    contato = getContato();
                    if (contato != null) {
                        
                        excluirContato(contato);
                    }

                    opcao = 4;
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }


        } while (opcao != 4);
            
    }

    public static void editarDados(Contato contato) {
        boolean sair = false;
        boolean respValida = false;
        int opcao;
        String resp, novoDado;

        do { 
            System.out.println("- Editar Contato: " + contato.getId() + " ");
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("Email: " + contato.getEmail());
            System.out.println();
            System.out.println(" Informar dado a ser alterado? ");
            System.out.println(" 1 - Nome                                 ");
            System.out.println(" 2 - Telefone                             ");
            System.out.println(" 3 - Email                                ");
            System.out.println(" 4 - Cancelar                             ");
            System.out.println(" ");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(scan.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Insira o novo nome do contato: ");
                    novoDado = scan.nextLine();

                    System.out.println(" Contato: " + contato.getId() + " ");
                    System.out.println("Nome: " + novoDado);
                    System.out.println("Telefone: " + contato.getTelefone());
                    System.out.println("Email: " + contato.getEmail());
                    System.out.println();
                    
                    do {
                        System.out.print("Salvar Alterações? (S/N) ");
                        resp = scan.nextLine();

                        if (resp.toUpperCase().equals("S")) {
                            System.out.println("Alterações Salvas");
                            contato.setNome(novoDado);
                            respValida = true;
                        } else if (resp.toUpperCase().equals("N")) {
                            System.out.println("Alterações Canceladas");
                            respValida = true;
                        } else {
                            System.out.println("Comando Inválido");
                        }

                    } while (!respValida);

                    sair = true;
                    break;
                case 2:
                    System.out.print("Insira o novo telefone do contato: ");
                    novoDado = scan.nextLine();
                    
                    System.out.println(" Contato: " + contato.getId() + " ");
                    System.out.println("Nome: " + contato.getNome());
                    System.out.println("Telefone: " + novoDado);
                    System.out.println("Email: " + contato.getEmail());
                    System.out.println();
                    
                    do {
                        System.out.print("Salvar Alterações? (S/N) ");
                        resp = scan.nextLine();
                        
                        if (resp.toUpperCase().equals("S")) {
                            System.out.println("Alterações Salvas");
                            contato.setTelefone(novoDado);
                            respValida = true;
                        } else if (resp.toUpperCase().equals("N")) {
                            System.out.println("Alterações Canceladas");
                            respValida = true;
                        } else {
                            System.out.println("Comando Invalido");
                        }

                    } while (!respValida);

                    sair = true;
                    break;
                case 3:
                    System.out.print("Insira o novo email do contato: ");
                    novoDado = scan.nextLine();
                    
                    System.out.println(" Contato: " + contato.getId() + " ");
                    System.out.println("Nome: " + contato.getNome());
                    System.out.println("Telefone: " + contato.getTelefone());
                    System.out.println("Email: " + novoDado);
                    System.out.println();
                    
                    do {
                        System.out.print("Salvar Alterações? (S/N) ");
                        resp = scan.nextLine();
                        
                        if (resp.toUpperCase().equals("S")) {
                            System.out.println("Alterações Salvas");
                            contato.setEmail(novoDado);
                            respValida = true;
                        } else if (resp.toUpperCase().equals("N")) {
                            System.out.println("Alterações Canceladas");
                            respValida = true;
                        } else {
                            System.out.println("Comando Inválido");
                        }

                    } while (!respValida);

                    sair = true;
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }

        } while (!sair);

       
    }

    public static void voltarVersao(Contato contato) {
        boolean respValida = false;
        String resp;

        System.out.println(" Editar Contato: " + contato.getId() + " ");
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Telefone: " + contato.getTelefone());
        System.out.println("Email: " + contato.getEmail());
        System.out.println();

        do {
            System.out.print("Deseja Voltar uma Versão Deste Contato? (S/N) ");
            resp = scan.nextLine();

            if (resp.toUpperCase().equals("S")) {
                System.out.println("Retornando a ultima versão");
                try {
                    contato.desfazer();
                } catch (PilhaVaziaException e) {
                    System.out.println("Não existem versões anteriores");
                }
                respValida = true;
            } else if (resp.toUpperCase().equals("N")) {
                System.out.println("Retornando ao menu");
                respValida = true;
            } else {
                System.out.println("Opção Inválida");
            }

        } while (!respValida);

    }

    public static void excluirContato(Contato contato) {
        boolean respValida = false;
        String resp;
        
        System.out.println(" Excluindo Contato: " + contato.getId() + " ");
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Telefone: " + contato.getTelefone());
        System.out.println("Email: " + contato.getEmail());
        System.out.println();

        do {
            System.out.print("Deseja Excluir Este Contato? (S/N) ");
            resp = scan.nextLine();

            if (resp.toUpperCase().equals("S")) {
                for (int i = 0; i < listaContatos.size(); i++) {
                    if (listaContatos.get(i).getId() == contato.getId()) {
                        listaContatos.remove(i);
                        break;
                    }
                }
                respValida = true;
            } else if (resp.toUpperCase().equals("N")) {
                System.out.println("Retornando ao menu");
                respValida = true;
            } else {
                System.out.println("Comando Inválido");
            }

        } while (!respValida);
    }

    public static Contato getContato() {
        boolean sair = false;
        int id;
        String resp;

        do {
            System.out.print("Informe o ID do contato que você quer editar: ");
            id = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < listaContatos.size(); i++) {
                if (listaContatos.get(i).getId() == id) {
                    return listaContatos.get(i);
                }
            }
            
            System.out.print("ID não encontrado, tentar novamente? (S/N) ");
            resp = scan.nextLine();

            if (resp.toUpperCase().equals("N")) {
                sair = true;
            }
        } while (!sair);

        return null;
    }
     
}
