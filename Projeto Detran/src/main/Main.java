package main;

import java.util.Scanner;
import detran.Detran;
import usuario.Usuario;
import dados.Dados;

public class Main {
    private static Dados dados = new Dados();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Selecione o tipo de acesso:");
            System.out.println("1. Usuario");
            System.out.println("2. Detran");
            System.out.println("3. Sair");
            System.out.println("--------------------------");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    handleUsuario(scanner);
                    break;
                case 2:
                    handleDetran(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (choice != 3);
    }

    private static void handleUsuario(Scanner scanner) {
        int choice;
        do {
            System.out.println("Você selecionou Usuario.");
            System.out.println("Selecione uma ação:");
            System.out.println("1. Cadastrar conta");
            System.out.println("2. Obter dados do usuário");
            System.out.println("3. Voltar ao menu principal");
            System.out.println("--------------------------");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Informe nome, cpf, sexo, email (separados por vírgula):");
                    String[] userData = scanner.nextLine().split(",");
                    while (userData.length != 4) {
                        System.out.println("Entrada inválida. Por favor, insira nome, cpf, sexo e email separados por vírgula:");
                        userData = scanner.nextLine().split(",");
                    }
                    String nome = userData[0].trim();
                    String cpf = userData[1].trim();
                    String sexo = userData[2].trim();
                    String email = userData[3].trim();
                    // Aqui você pode criar uma instância de Usuario e chamar o método cadastrarConta
                    break;
                case 2:
                    System.out.println("Informe nome, cpf, sexo, email para obter dados (separados por vírgula):");
                    userData = scanner.nextLine().split(",");
                    while (userData.length != 4) {
                        System.out.println("Entrada inválida. Por favor, insira nome, cpf, sexo e email separados por vírgula:");
                        userData = scanner.nextLine().split(",");
                    }
                    nome = userData[0].trim();
                    cpf = userData[1].trim();
                    sexo = userData[2].trim();
                    email = userData[3].trim();
                    // Aqui você pode criar uma instância de Usuario e chamar o método obterDadosUsuario
                    break;
                case 3:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (choice != 3);
    }

    private static void handleDetran(Scanner scanner) {
        int choice;
        do {
            System.out.println("Você selecionou Detran.");
            System.out.println("Selecione uma ação:");
            System.out.println("1. Adicionar infração ao usuário");
            System.out.println("2. Deletar usuário");
            System.out.println("3. Obter dados do usuário pelo nome");
            System.out.println("4. Voltar ao menu principal");
            System.out.println("--------------------------");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Informe os dados da infração (tipo, valor, data, local, status, id - separados por vírgula):");
                    String[] infracaoData = scanner.nextLine().split(",");
                    String tipo = infracaoData[0].trim();
                    int valor = Integer.parseInt(infracaoData[1].trim());
                    int data = Integer.parseInt(infracaoData[2].trim());
                    String local = infracaoData[3].trim();
                    String status = infracaoData[4].trim();
                    String id = infracaoData[5].trim();
                    // Aqui você pode criar uma instância de Infracao e chamar o método adicionarInfracaoAoUsuario
                    break;
                case 2:
                    System.out.println("Deletando usuário...");
                    // Aqui você pode chamar o método deletarUsuario
                    break;
                case 3:
                    System.out.println("Informe o nome do usuário:");
                    String nome = scanner.nextLine();
                    Usuario usuarioEncontrado = dados.obterDadosPorNome(nome);
                    if (usuarioEncontrado != null) {
                        System.out.println("Dados do usuário:");
                        System.out.println("Nome: " + usuarioEncontrado.getNome());
                        System.out.println("CPF: " + usuarioEncontrado.getCpf());
                        System.out.println("Sexo: " + usuarioEncontrado.getSexo());
                        System.out.println("Email: " + usuarioEncontrado.getEmail());
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (choice != 4);
    }
}