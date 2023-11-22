package negocio;

import dados.Dados;

public class Usuario {
    private static String nome;
    private String cpf;
    private static String sexo;
    private static String email;
    private static Cnh cnh;
    private Veiculo veiculo;
    private static Veiculo[] veiculosPessoais;
    private static int numVeiculos;

    public Usuario(String nome, String cpf, String sexo, String email, Cnh cnh,Veiculo[] veiculosPessoais) {
		super();
		Usuario.nome = nome;
		this.cpf = cpf;
		Usuario.sexo = sexo;
		Usuario.email = email;
		Usuario.cnh = cnh;
		Usuario.veiculosPessoais = new Veiculo[50];
		Usuario.numVeiculos =0;
	}

    
    
	public String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Usuario.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public static void setSexo(String sexo) {
        Usuario.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Usuario.email = email;
    }

    public static Cnh getCnh() {
        return cnh;
    }

    public void setCnh(Cnh cnh) {
        Usuario.cnh = cnh;
    }
    
    public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public static Veiculo[] getVeiculosPessoais() {
		return veiculosPessoais;
	}
	
	public static Veiculo getVeiculosPessoais(int i) {
		return veiculosPessoais[i];
	}

	public static void setNumVeiculos(int numVeiculos) {
		Usuario.numVeiculos = numVeiculos;
	}
	
	public static void setVeiculosPessoais(Veiculo[] novoVetor) {
		Usuario.veiculosPessoais = novoVetor;
		setNumVeiculos(veiculosPessoais.length);
	}
	
	public static int getNumVeiculos() {
		return numVeiculos;
	}

	@Override
	public String toString() {
		if(getCnh()!= null){
			return "Usuario [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", email=" + email + 
					", Numero da Cnh = " + Cnh.getNumCnh() + "]";
		}
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", email=" + email + "]";
	}
    
    
    //Adicionar esses métodos a classe main
    public void associarCnhAoUsuario(Cnh cnh) {
    	if (cnh==null) {
    		Usuario.cnh = cnh;
		} else {
			System.out.println("O Usuario ja tem uma Cnh associada.");
		}
    	
    }
    
    public void associarVeiculoAoUsuario(Veiculo veiculo) {
    	if(getCnh()==null) {
    		System.out.println("O usuario nao tem uma cnh associada.");
    	}
    	else {
    		adicionarVeiculoPessoal(veiculo);
    	}
    }
    
    /*private static void adicionarVeiculoPessoal(Veiculo veiculo) {
        if (veiculosPessoais == null) {
        	veiculosPessoais = new Veiculo[1];
        } else {
            Veiculo[] novoVeiculosPessoais = new Veiculo[veiculosPessoais.length + 1];
            System.arraycopy(veiculosPessoais, 0, novoVeiculosPessoais, 0, veiculosPessoais.length);
            veiculosPessoais = novoVeiculosPessoais;
        }

        veiculosPessoais[veiculosPessoais.length - 1] = veiculo;
    }
    */
    
    public void listarVeiculosPessoais(){
    	if (naoPossuiVeiculos()) {
			System.out.println("Nao ha veiculos cadastrados para este Usuario.");
		}
    	else {
    		for (int i = 0; i < veiculosPessoais.length; i++){
    			if(getVeiculosPessoais(i)!=null){
    				System.out.println(i + " -> " + getVeiculosPessoais(i));
    			}
    		}
    	}
    	
    }
    
    public void adicionarVeiculoPessoal(Veiculo veiculo) {
        if (numVeiculos > 50) {
            System.out.println("Limite de veiculos excedido.");
        }
        else {
        	veiculosPessoais[numVeiculos] = veiculo;
        	setNumVeiculos(numVeiculos+1);
        }
    }

    public boolean naoPossuiVeiculos() {
        for (Veiculo veiculo : veiculosPessoais) {
            if (veiculo != null) {
                return false; // Se encontrar pelo menos um veículo, retorna falso
            }
        }
        return true; // Se nenhum veículo for encontrado, retorna verdadeiro
    }


	public void listarVeiculosPeloModelo() {
		if (naoPossuiVeiculos()) {
			System.out.println("Nao ha veiculos cadastrados para este Usuario.");
		}
    	else {
    		for (int i = 0; i < veiculosPessoais.length; i++){
    			if(getVeiculosPessoais(i)!=null){
    				System.out.println(i + " -> " + getVeiculosPessoais(i).getModelo());
    			}
    		}
    	}	
	}
	
	public void removerVeiculo(Veiculo veiculo) {
	    if (veiculosPessoais != null && veiculosPessoais.length > 0) {
	        int y = 0;
	        for (int x = 0; x < numVeiculos; x++) {
	            if (veiculosPessoais[x].equals(veiculo)) {
	                y = 1;
	                break;
	            }
	        }

	        if (y == 1) {
	            if (veiculosPessoais.length > 1) {
	                Veiculo[] novoVetor = new Veiculo[veiculosPessoais.length - 1];
	                int novoIndice = 0;

	                for (int i = 0; i < veiculosPessoais.length; i++) {
	                    if (veiculosPessoais[i] != null && veiculosPessoais[i].equals(veiculo)) {
	                        continue;
	                    } else {
	                        novoVetor[novoIndice++] = veiculosPessoais[i];
	                    }
	                }

	                veiculosPessoais = novoVetor;
	            } else {
	                veiculosPessoais = null; // Se há apenas um veículo, definir o vetor como nulo
	            }
	        } else {
	            System.out.println("Veiculo nao encontrado.");
	        }
	    } else {
	        System.out.println("Usuario nao tem veiculos associados.");
	    }
	}
	
	public static void obterDadosDaInfracao(String id) {
		int x=0;
		for (int i = 0; i < Dados.getnInfracoes(); i++) {
			if (Dados.getInfracoes(i).getId().equals(id)) {
				x++;
				System.out.println(i + " -> " + Dados.getInfracoes(i).toString());
			} 
		}
		if(x==0) {
			System.out.println("Infracao nao encontrada.");
		}
	}
	
	public static boolean pagarInfracao(String id){
		int x = 0;
		Infracao infracao = null;
		for (int i = 0; i < Dados.getnInfracoes(); i++) {
			if (Dados.getInfracoes(i).getId().equals(id)) {
				infracao = Dados.getInfracoes(i);
				x++;
				if (infracao.getStatus() == true) {
					System.out.println("Infracao ja paga.");
				} else {
					Infracao.setStatus(true);
					System.out.println("Infracao paga com sucesso.");
				}
			} 
		}
		if(x==0) {
			System.out.println("Infracao nao encontrada.");
		}
		return infracao.getStatus();
	}
	
	public static void editarUsuario(Usuario usuario,int escolhaUsuario,String dado) {
		switch (escolhaUsuario) {
			case 1://Mudar nome
				Usuario.setNome(dado);
				System.out.println("Nome alterado com sucesso!");
				break;
			case 2://Mudar Email
				Usuario.setEmail(dado);
				System.out.println("Email alterado com sucesso!");
				break;
			case 3://Mudar Sexo
				Usuario.setSexo(dado);
				System.out.println("Sexo alterado com sucesso!");
				break;
		}
	}
}


