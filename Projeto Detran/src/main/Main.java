package main;

import java.util.Scanner;

import negocio.*;
import dados.Dados;

public class Main {
    private static Dados dados = new Dados();
    private static Detran detran = new Detran(dados);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("--------------------------");
            System.out.println("Selecione o tipo de acesso:");
            System.out.println("1. Usuario");
            System.out.println("2. Detran");
            System.out.println("3. Sair");
            System.out.println("--------------------------");
            choice = scanner.nextInt();
            scanner.nextLine();

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
            System.out.println("--------------------------");
            System.out.println("Você selecionou Usuario.");
            System.out.println("Selecione uma ação:");
            System.out.println("1. Cadastrar conta");
            System.out.println("2. Obter dados do usuário");
            System.out.println("3. Obter dados do veículo de um usuário específico");
            System.out.println("4. Voltar ao menu principal");
            System.out.println("--------------------------");
            choice = scanner.nextInt();
            scanner.nextLine();

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
                    break;
                case 3:
                    System.out.println("Informe o nome ou CPF do usuário:");
                    String identificador = scanner.nextLine();
                    Usuario usuarioEncontrado = Usuario.obterUsuarioPorNomeOuCpf(identificador);
                    if (usuarioEncontrado != null) {
                        Veiculo veiculo = usuarioEncontrado.getVeiculo();
                        if (veiculo != null) {
                            System.out.println("Dados do veículo:");
                            System.out.println("Modelo: " + veiculo.getModelo());
                            System.out.println("Placa: " + veiculo.getPlaca());
                            System.out.println("Cor: " + veiculo.getCor());
                            System.out.println("Ano: " + veiculo.getAno());
                            System.out.println("Estado: " + veiculo.getEstado());
                            System.out.println("Marca: " + veiculo.getMarca());
                        } else {
                            System.out.println("O usuário não possui um veículo associado.");
                        }
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

    private static void handleDetran(Scanner scanner) {
        System.out.println("Informe o login do Detran:");
        String login = scanner.nextLine();
        System.out.println("Informe a senha do Detran:");
        String senha = scanner.nextLine();

        if (!detran.autenticarDetran(login, senha)) {
            System.out.println("Login ou senha incorretos.");
            return;
        }

        int choice;
        do {
            System.out.println("--------------------------");
            System.out.println("Você selecionou Detran.");
            System.out.println("Selecione uma ação:");
            System.out.println("1. Adicionar infração ao usuário");
            System.out.println("2. Deletar usuário");
            System.out.println("3. Obter dados do usuário pelo nome");
            System.out.println("4. Listar todos os usuários");
            System.out.println("5. Listar todas as infrações");
            System.out.println("6. Listar todas as CNHs");
            System.out.println("7. Voltar ao menu principal");
            System.out.println("--------------------------");
            choice = scanner.nextInt();
            scanner.nextLine();

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
                    break;
                case 2:
                    System.out.println("Deletando usuário...");
                    break;
                case 3:
                    System.out.println("Informe o nome do usuário:");
                    String nome = scanner.nextLine();
                    Usuario usuarioEncontrado = Usuario.obterDadosPorNome(nome);
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
                    System.out.println("Listando todos os usuários...");
                    for (Usuario usuario : dados.getUsuarios()) {
                        System.out.println("Nome: " + usuario.getNome());
                        System.out.println("CPF: " + usuario.getCpf());
                        System.out.println("Sexo: " + usuario.getSexo());
                        System.out.println("Email: " + usuario.getEmail());
                        System.out.println("--------------------------");
                    }
                    break;
                case 5:
                    System.out.println("Listando todas as infrações...");
                    for (Infracao infracao : dados.getInfracoes()) {
                        System.out.println("Tipo: " + infracao.getTipo());
                        System.out.println("Valor: " + infracao.getValor());
                        System.out.println("Data: " + infracao.getDataInfracao());
                        System.out.println("Local: " + infracao.getLocal());
                        System.out.println("Status: " + infracao.getStatus());
                        System.out.println("ID: " + infracao.getId());
                        System.out.println("--------------------------");
                    }
                    break;
                case 6:
                    System.out.println("Listando todas as CNHs...");
                    for (Cnh cnh : dados.getCnhs()) {
                        System.out.println("Categoria: " + cnh.getCategoria());
                        System.out.println("UF Emissão: " + cnh.getUfEmissao());
                        System.out.println("Data Emissão: " + cnh.getDataEmissao());
                        System.out.println("Data Validade: " + cnh.getDataValidade());
                        System.out.println("Pontuação: " + cnh.getPontuacao());
                        System.out.println("Status: " + cnh.getStatus());
                        System.out.println("Número CNH: " + cnh.getNumCnh());
                        System.out.println("--------------------------");
                    }
                    break;
                case 7:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (choice != 7);
    }
}
