package negocio;

public class Usuario {
    private String nome;
    private String cpf;
    private String sexo;
    private String email;
    private static Cnh cnh;
    private Veiculo veiculo;
    private static Veiculo[] veiculosPessoais;
    private int numVeiculos;

    public Usuario(String nome, String cpf, String sexo, String email, Cnh cnh,Veiculo[] veiculosPessoais) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.email = email;
		Usuario.cnh = cnh;
		Usuario.veiculosPessoais = new Veiculo[50];
		this.numVeiculos =0;
	}


	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

	

	public Veiculo[] getVeiculosPessoais() {
		return veiculosPessoais;
	}
	
	public Veiculo getVeiculosPessoais(int i) {
		return veiculosPessoais[i];
	}

	public void setVeiculosPessoais(Veiculo[] veiculosPessoais) {
		Usuario.veiculosPessoais = veiculosPessoais;
	}
	
	public int getNumVeiculos() {
		return numVeiculos;
	}

	public void setNumVeiculos(int numVeiculos) {
		this.numVeiculos = numVeiculos;
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
    		System.out.println("O usuario não tem uma cnh associada");
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
			System.out.println("Nao ha veiculos cadastrados para este Usuario");
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
            System.out.println("Limite de veiculos excedido");
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
}


