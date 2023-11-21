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
	        int choice = -1;
	        dados.NovosDados();
	       while(choice != 3)
		       {   
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
		                	//listarUsuarios();
		                //	listarCnhs();
		                	cadastrUsr();
		                //	listarCnhs();
		                //	listarUsuarios();
		                	break;
		                        
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
    
    

  //Méotodo dedicado ao cadastro de uma nova Cnh 
    public static boolean cadastrUsr()
    {
   		Usuario N = lerDadosUsr ();
   		 if (Dados.getnCnhs() < 100) 
   	        {
   	        	Dados.setUsuario(Dados.getnUsuarios(), N);
   	        	Dados.setnUsuarios(Dados.getnUsuarios()+1);
   	        	System.out.println("Usuario cadastrado com sucesso.");
   	        	return true;
   	        }
        else 
   	        {
   	        	System.out.println("Não foi possivel cadastrar o Usuario!\n");
   	        	return false;
   	        }
    }    
    
    
    
    
// Méotodo dedicado a leitura de dados de um novo Usuário    
 public static Usuario lerDadosUsr ()
 {
	// in.nextLine(); //esvazia dados do teclado 
 	 String nome;
     String cpf;
     String sexo;
     String email;
	 System.out.println("--------------------------");
     System.out.println("Informe os dados para o cadastro do usuario.");
     System.out.println("Digite o nome do usuário:");
     nome = in.nextLine();
     System.out.println("Digite o numero de CPF:");
     cpf = in.nextLine();
     System.out.println("Digite o sexo:");
     sexo = in.nextLine();
     System.out.println("Digite o email:");
     email = in.nextLine();
     System.out.println("Dados recebidos");
 	 System.out.println("Usuario Habilitado?");
	 System.out.println("--------------------------");
	 System.out.println("1. Sim");
	 System.out.println("2. Não");
	 System.out.println("--------------------------");
	 int   choice = in.nextInt();
	System.out.println(nome + " " + cpf+ " " +sexo+ " " + email+ " " + choice); //teste de dados lidos
	 if (choice == 1) 
	 	{ 
		 in.nextLine();
		    cadastrarCnh();
		 	Usuario usuarioAux = new Usuario(nome, cpf, sexo, email, Dados.getCnhs(Dados.getnCnhs() - 1));
		 	in.nextLine();
		 	return usuarioAux; 
	 	}
	 else if (choice == 2)
		 {
		 	Usuario usuarioAux = new Usuario(nome, cpf, sexo, email, null);
		 	in.nextLine();
		 	return usuarioAux; 
		 }
	 else
		 {
		 System.out.println("Opção inválida.");
		 }
	 Usuario usuarioAux = new Usuario(nome, cpf, sexo, email, null);
	 return usuarioAux;
 }
    

 
//Méotodo dedicado ao cadastro de uma nova Cnh 
 public static boolean cadastrarCnh()
 {
		Cnh N = lerDadosCnh ();
		 if (Dados.getnCnhs() < 100) 
	        {
	        	Dados.setCnh(Dados.getnCnhs(), N);
	        	Dados.setnCnhs(Dados.getnCnhs()+1);
	        	System.out.println("Cnh cadastrado com sucesso.");
	        	return true;
	        }
     else 
	        {
	        	System.out.println("Não foi possivel cadastrar a Cnh!\n");
	        	return false;
	        }
 } 


//Méotodo dedicado a leitura de dados de uma Cnh
 public static Cnh lerDadosCnh ()
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
  //   System.out.println(categoria + " " + ufEmissao+ " " +dataValidade+ " " + dataEmissao+ " " + pontuacao+ " " + status+ " " + numCnh); //teste de dados lidos
	 Cnh cnhAux = new Cnh(categoria,ufEmissao,dataValidade,dataEmissao, pontuacao,status,numCnh);
	 return cnhAux;
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

	

}	
	
