package main;

import java.util.Scanner;

import negocio.*;
import dados.Dados;

public class Main {
    private static Dados dados = new Dados();
	//private static Detran detran = new Detran(dados);
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
    	dados.NovosDados();
        Scanner scanner = new Scanner(System.in);
        int choice;
            System.out.println("\n--------------------------");
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
                    //handleDetran(scanner);
                	System.out.println("Opcao invalida ate o momento");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
}

    private static void handleUsuario(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n--------------------------");
            System.out.println("Voce selecionou Usuario.\n");
            System.out.println("Selecione uma acao:\n");
            System.out.println("1. Cadastrar conta");
            System.out.println("2. Obter dados do usuario");
            System.out.println("3. Obter dados dos veiculos de um usuario");
            System.out.println("4. Ir para a parte de veiculos");
            System.out.println("5. Ir para a parte Infracoes");
            System.out.println("6. Voltar ao menu principal\n");
            System.out.println("--------------------------");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                	System.out.println("Informe os dados do usuario:");
                	String nome;
                    String cpf;
                    String sexo;
                    String email;
                    
                    System.out.println("Digite o nome do usuário:");
                    nome = in.nextLine();
                    System.out.println("Digite o numero de cpf:");
                    cpf = in.nextLine();
                    for (int i = 0; i < Dados.getnUsuarios(); i++) {
                    	if(Dados.getUsuarios(i).getCpf().equals(cpf)){
                    		System.out.println("Cpf ja cadastrado, tente novamente.");
                    		handleUsuario(scanner);
                    	}
                    }
                    System.out.println("Digite o sexo:");
                    sexo = in.nextLine();
                    System.out.println("Digite o email:");
                    email = in.nextLine();
                    for (int i = 0; i < Dados.getnUsuarios(); i++) {
	                	if(Dados.getUsuarios(i).getEmail().equals(email)){
	                		System.out.println("Email ja cadastrado, tente novamente.");
	                		handleUsuario(scanner);
	                	}
                    }
                    System.out.println("Dados recebidos");  
                    System.out.println("--------------------------");
                	System.out.println("Você ja tem uma Cnh?");
                	do {
                        System.out.println("--------------------------");
                        System.out.println("1. Nao");
                        System.out.println("2. Sim");
                        System.out.println("--------------------------");
                        choice = scanner.nextInt();
                        scanner.nextLine();

                        switch (choice) {
                            case 1:
                            	cadastrarContaSemCnh(nome,cpf,sexo,email);
                            	handleUsuario(scanner);
                            case 2:
                            	System.out.println("Informe os dados da cnh:");
                            	cadastrarContaComCnh(nome,cpf,sexo,email);
                            	handleUsuario(scanner);
                            default:
                                System.out.println("Opção inválida.");
                                break;
                        }
                    } while (choice != 2);
                        
                case 2:
                    System.out.println("Informe o cpf do usuario:");
                    String codigo = scanner.nextLine();
                    Dados.buscarUsuarioPorCpf(codigo);
                    break;
                    
                case 3:
                    System.out.println("Informe o nome ou CPF do usuário:");
                    String identificador = scanner.nextLine();
                    Usuario usuarioEncontrado = Dados.obterUsuarioPorNomeOuCpf(identificador);
                    if (usuarioEncontrado != null) {
                        	usuarioEncontrado.listarVeiculosPessoais();
                        }  
                    else {
                        System.out.println("Usuario nao encontrado.");
                    }
                    break;

                case 4:
                	handleVeiculo(scanner);
                    break;
                case 5:
                	handleInfracao(scanner);
                    break;	
                case 6:
                    System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            	}
        	} while (choice != 6);
    	}
    
    private static void handleVeiculo(Scanner scanner) {
    	int choice;
    	do {
            System.out.println("\n--------------------------");
            System.out.println("Voce selecionou Veiculos.\n");
            System.out.println("Selecione uma acao:\n");
            System.out.println("1. Cadastrar Veiculo a um usuario");
            System.out.println("2. Obter dados dos veiculos de um usuario");
            System.out.println("3. Listar modelos dos veiculos do usuario");
            System.out.println("4. Obter daado de um veiculo especifico");
            System.out.println("5. Voltar ao menu principal\n");
            System.out.println("--------------------------");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                	System.out.println("Esqueci de fazer...");
                	break;
                case 2:
                	System.out.println("Informe o nome ou CPF do usuário:");
                    String identificador = scanner.nextLine();
                    Usuario usuarioEncontrado = Dados.obterUsuarioPorNomeOuCpf(identificador);
                    if (usuarioEncontrado != null) {
                        	usuarioEncontrado.listarVeiculosPessoais();
                        }  
                    else {
                        System.out.println("Usuario nao encontrado.");
                    }
                    break;  

                case 3: //Listar modelos dos veiculos do usuario
                	System.out.println("Informe o nome ou CPF do usuário:");
                    String id = scanner.nextLine();
                    Usuario User = Dados.obterUsuarioPorNomeOuCpf(id);
                    if (User != null) {
                        	User.listarVeiculosPeloModelo();
                        }  
                    else {
                        System.out.println("Usuario nao encontrado.");
                    }
                    break;  
                case 4: //Obter dados de um veiculo especifico
                	System.out.println("Informe o nome ou CPF do usuário:");
                    String cpf = scanner.nextLine();
                    Usuario user = Dados.obterUsuarioPorNomeOuCpf(cpf);
                    if (user != null) {
                    	System.out.println("Informe a placa do veículo:");
                        String placa = scanner.nextLine();
                        ObterDadosDoVeiculo(user,placa);
                    }  
                    else {
                        System.out.println("Usuario nao encontrado.");
                    }
                    break;  
                case 5:
                	System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            } 
    	}while (choice != 5);
		
	}

	/*private static void handleDetran(Scanner scanner) {
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
                  Infracao novaInfracao = Detran.cadastrarInfracao(infracaoData);
                  break;
              case 2:
                  System.out.println("Informe o usuario a ser deletado:");
                  String cpfDoUsuario = scanner.nextLine();
                  Detran.deletarUsuario(cpfDoUsuario);
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
                  //listarUsuarios();
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
                      System.out.println("Número CNH: " + Cnh.getNumCnh());
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
    }*/
    
    private static void handleInfracao(Scanner scanner) {
    	int choice;
    	do {
            System.out.println("\n--------------------------");
            System.out.println("Voce selecionou Infracoes.\n");
            System.out.println("Selecione uma acao:\n");
            System.out.println("1. Listar Infracoes");
            System.out.println("2. Consultar Infracao");
            System.out.println("3. Pagar infracao");
            System.out.println("4. Voltar ao menu principal\n");
            System.out.println("--------------------------");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1://Listar Infracoes
                	System.out.println("Informe o nome ou CPF do usuário:");
                    String identificador = scanner.nextLine();
                    Usuario usuarioEncontrado = Dados.obterUsuarioPorNomeOuCpf(identificador);
                    if (usuarioEncontrado != null) {
                    		listarInfracoesDoUsuario(usuarioEncontrado);
                        }  
                    else {
                        System.out.println("Usuario nao encontrado.");
                    }
                    break;  
                case 2: //Consultar Infracao
                	System.out.println("Informe o ID da Infracao:");
                    String id = scanner.nextLine();
                    Usuario.obterDadosDaInfracao(id);
                    break;	
                case 3: //Pagar infracao
                	System.out.println("Informe o ID da Infracao:");
                    String entrada = scanner.nextLine();
                    Usuario.pagarInfracao(entrada);
                    break;  
                case 4:
                	System.out.println("Retornando ao menu principal...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            } 
    	}while (choice != 4);
		
	}
    
    public static void listarUsuarios() {
		for(int i = 0; i < Dados.getnUsuarios(); i++) 
			System.out.println(i + " -> " + Dados.getUsuarios()[i].toString());
		}
	
	public static void listarUsuariosPorNome() {
		for(int i = 0; i < Dados.getnUsuarios(); i++) 
			System.out.println(i + " -> " + Dados.getUsuarios()[i].getNome());
		}
	
	public static void listarCnhs() {
		for(int i = 0; i < Dados.getnCnhs(); i++) 
			System.out.println(i + " -> " + Dados.getCnhs()[i].toString());
		}
	public static void listarCnhsPorNumero() {
		for(int i = 0; i < Dados.getnCnhs(); i++) 
			System.out.println(i + " -> " + Cnh.getNumCnh());
		}
	
	public static void listarInfracoesDoUsuario(Usuario usuario){
		int x=0;
		for (int i = 0; i < Dados.getnInfracoes(); i++) {
			if (Dados.getInfracoes(i).getCnh().equals(Usuario.getCnh())) {
				x++;
				System.out.println(i + " -> " + Dados.getInfracoes(i).toString());
			} 
		}
		if(x==0) {
			System.out.println("Este usuario nao tem Infracoes.");
		}
	}
	
	public static void listarVeiculos() {
		for(int i = 0; i < dados.getnVeiculos(); i++) 
			System.out.println(i + " -> " + dados.getVeiculos()[i].toString());
		}
	
	public static void listarVeiculosPeloModelo() {
		for(int i = 0; i < dados.getnVeiculos(); i++) 
			System.out.println(i + " -> " + dados.getVeiculos()[i].getModelo());
		}
	
	public static boolean ObterDadosDoVeiculo(Usuario usuario,String placa) {
		boolean dado = false;
		for(int i = 0; i < dados.getnVeiculos(); i++) 
			if (Usuario.getVeiculosPessoais(i) != null && Usuario.getVeiculosPessoais(i).getPlaca().equals(placa)) {
				System.out.println(" -> " + Usuario.getVeiculosPessoais(i).toString());
				dado = true;
			}
		if(dado == false) {
			System.out.println("Veiculo nao encontrado");
			}
		return dado;
	}
	
	public static boolean cadastrarContaSemCnh(String nome,String cpf,String sexo,String email){
        if (Dados.getnUsuarios() < 100) {
        	Dados.getUsuarios()[Dados.getnUsuarios()] = new Usuario(nome, cpf, sexo, email, null,null);
        	Dados.setnUsuarios(Dados.getnUsuarios()+1);
        	System.out.println("Usuario cadastrado com sucesso.");
        	return true;
        }
        else {
        	System.out.println("Não foi possivel cadastrar o usuario!\n");
        	return false;
        }
    }
	
	public static boolean cadastrarContaComCnh(String nome,String cpf,String sexo,String email){
		String categoria;
	    String ufEmissao;
	    String dataValidade;
	    String dataEmissao;
	    double pontuacao;
	    String status;
	    String numCnh;

        System.out.println("Digite a categoria da Cnh: ");
        categoria = in.nextLine();
        System.out.println("Digite a Uf de Emissao:");
        ufEmissao = in.nextLine();
        System.out.println("Digite a data de Validade:");
        dataValidade = in.nextLine();
        System.out.println("Digite a data de Emissao:");
        dataEmissao = in.nextLine();
        System.out.println("Digite o status da Cnh (Ativa, cassada...):");
        status = in.nextLine();
        System.out.println("Digite o numero da Cnh:");
        numCnh = in.nextLine();
        System.out.println("Digite o numero da pontuacao:");
        pontuacao = in.nextDouble();
		
        if (Dados.getnCnhs() < 100) {
        	Dados.getCnhs()[Dados.getnCnhs()] = new Cnh(categoria,ufEmissao,dataValidade,dataEmissao
        			,pontuacao,status,numCnh);
        	Dados.getUsuarios()[Dados.getnUsuarios()] = new Usuario(nome, cpf, sexo, email, Dados.getCnhs()[Dados.getnCnhs()],null);
        	Dados.setnCnhs(Dados.getnCnhs()+1);
        	Dados.setnUsuarios(Dados.getnUsuarios()+1);
        	System.out.println("Usuario cadastrado com sucesso.");
        	return true;
        }
        else {
        	System.out.println("Não foi possivel cadastrar o usuario!\n");
        	return false;
        }
    }

	
}

    