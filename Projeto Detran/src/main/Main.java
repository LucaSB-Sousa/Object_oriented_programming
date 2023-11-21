package main;

import java.util.Scanner;

import negocio.*;
import dados.Dados;

public class Main 
{
    private static Dados dados = new Dados();
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        int choice;
	            System.out.println("--------------------------");
	            System.out.println("Selecione o tipo de acesso:");
	            System.out.println("1. Usuario");
	            System.out.println("2. Detran");
	            System.out.println("3. Sair");
	            System.out.println("--------------------------");
	            choice = scanner.nextInt();
	            scanner.nextLine();
	            switch (choice) 
		            {
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

    private static void handleUsuario(Scanner scanner) 
	    {
	        int choice;
	        do {
	            System.out.println("--------------------------");
	            System.out.println("Voce selecionou Usuario.");
	            System.out.println("Selecione uma acao:");
	            System.out.println("1. Cadastrar conta");
	            System.out.println("2. Obter dados do usuário");
	            System.out.println("3. Obter dados do veículo de um usuário específico");
	            System.out.println("4. Voltar ao menu principal");
	            System.out.println("--------------------------");
	            choice = scanner.nextInt();
	            scanner.nextLine();
	
	            switch (choice) 
	            	{
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
		                    System.out.println("Digite o sexo:");
		                    sexo = in.nextLine();
		                    System.out.println("Digite o email:");
		                    email = in.nextLine();
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
		
		                        switch (choice) 
			                        {
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
		                    if (usuarioEncontrado != null) 
		                    	{
			                        if (usuarioEncontrado.getVeiculosPessoais() != null) 
			                        	{
			                        		usuarioEncontrado.listarVeiculosPessoais();
			                        	} 
			                        else 
				                        {
				                            System.out.println("O usuário não possui um veículo associado.");
				                        }
		                    	} 
		                    else 
			                    {
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
     
    public static void listarUsuarios() 
    	{
			for(int i = 0; i < Dados.getnUsuarios(); i++)
				{
					System.out.println(i + " -> " + Dados.getUsuarios()[i].toString());
				}	
		}
	
	public static void listarUsuariosPorNome() 
		{
			for(int i = 0; i < Dados.getnUsuarios(); i++)
				{
					System.out.println(i + " -> " + Dados.getUsuarios()[i].getNome());
				}
		}
	
	public static void listarCnhs() 
		{
			for(int i = 0; i < Dados.getnCnhs(); i++) 
				{
					System.out.println(i + " -> " + Dados.getCnhs()[i].toString());
				}
		}
	
	public static void listarCnhsPorNumero() 
		{
			for(int i = 0; i < Dados.getnCnhs(); i++) 
				{
					System.out.println(i + " -> " + Cnh.getNumCnh());
				}
		}
	
	public static void listarInfracoes() 
		{
			for (int i = 0; i < dados.getnInfracoes(); i++) 
				{
					System.out.println(i+ " -> " + dados.getInfracoes()[i].toString());
				}
		}
	
	public static void listarVeiculos() 
		{
			for(int i = 0; i < dados.getnVeiculos(); i++)
				{
					System.out.println(i + " -> " + dados.getVeiculos()[i].toString());
				}
		}
	
	public static void listarAutomoveisComEixo() 
		{
			for(int i = 0; i < dados.getnAutosComEixo(); i++)
				{
					System.out.println(i + " -> " + dados.getAutosComEixo()[i].toString());
				}	
		}
	
	public static void listarCaminhoes() 
		{
			for(int i = 0; i < dados.getnCaminhoes(); i++)
				{
					System.out.println(i + " -> " + dados.getCaminhoes()[i].toString());
				}
		}
	
	public static void listarMotos() 
		{
			for(int i = 0; i < dados.getnMotos(); i++) 
				{ 
					System.out.println(i + " -> " + dados.getMotos()[i].toString());
				}
		}
	public static void listarCarros() 
		{
			for(int i = 0; i < dados.getnCarros(); i++) 
				{
					System.out.println(i + " -> " + dados.getCarros()[i].toString());
				}
		}
	
	public static void listarVans() 
		{
			for(int i = 0; i < dados.getnVans(); i++) 
				{ 
					System.out.println(i + " -> " + dados.getVans()[i].toString());
				}
		}
	
	public static boolean cadastrarContaSemCnh(String nome,String cpf,String sexo,String email)
		{
	        if (Dados.getnUsuarios() < 100) 
		        {
		        	Dados.setnUsuarios(Dados.getnUsuarios()+1);
		        	Dados.getUsuarios()[Dados.getnUsuarios()] = new Usuario(nome, cpf, sexo, email, null);
		        	System.out.println("Usuario cadastrado com sucesso.");
		        	return true;
		        }
	        else 
		        {
		        	System.out.println("Não foi possivel cadastrar o usuario!\n");
		        	return false;
		        }
	    }
	
	public static boolean cadastrarContaComCnh(String nome,String cpf,String sexo,String email)
		{
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
			
	        if (Dados.getnCnhs() < 100) 
		        {
		        	Dados.setnCnhs(Dados.getnCnhs()+1);
		        	Dados.setnUsuarios(Dados.getnUsuarios()+1);
		        	Dados.getCnhs()[Dados.getnCnhs()] = new Cnh(categoria,ufEmissao,dataValidade,dataEmissao
		        			,pontuacao,status,numCnh);
		        	Dados.getUsuarios()[Dados.getnUsuarios()] = new Usuario(nome, cpf, sexo, email, Dados.getCnhs()[Dados.getnCnhs()]);
		        	System.out.println("Usuario cadastrado com sucesso.");
		        	return true;
		        }
	        else 
		        {
		        	System.out.println("Não foi possivel cadastrar o usuario!\n");
		        	return false;
		        }
	    }
	
}









/*private static void handleDetran(Scanner scanner) {
//System.out.println("Informe o login do Detran:");
//String login = scanner.nextLine();
//System.out.println("Informe a senha do Detran:");
//String senha = scanner.nextLine();
//
//if (!detran.autenticarDetran(login, senha)) {
//  System.out.println("Login ou senha incorretos.");
//  return;
//}

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
//      case 2:
//          System.out.println("Informe o usuario a ser deletado:");
//          String cpfDoUsuario = scanner.nextLine();
//          Detran.deletarUsuario(cpfDoUsuario);
//          break;
//      case 3:
//          System.out.println("Informe o nome do usuário:");
//          String nome = scanner.nextLine();
//          Usuario usuarioEncontrado = Usuario.obterDadosPorNome(nome);
//          if (usuarioEncontrado != null) {
//              System.out.println("Dados do usuário:");
//              System.out.println("Nome: " + usuarioEncontrado.getNome());
//              System.out.println("CPF: " + usuarioEncontrado.getCpf());
//              System.out.println("Sexo: " + usuarioEncontrado.getSexo());
//              System.out.println("Email: " + usuarioEncontrado.getEmail());
//          } else {
//              System.out.println("Usuário não encontrado.");
//          }
//          break;
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
    