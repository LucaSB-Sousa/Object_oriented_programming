package negocio;

public class Usuario {
    private String nome;
    private String cpf;
    private String sexo;
    private String email;
    private Cnh cnh;
    private Veiculo veiculo;
    private static Veiculo[] veiculosPessoais;

    public Usuario(String nome, String cpf, String sexo, String email, Cnh cnh) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.email = email;
		this.cnh = cnh;
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

    public Cnh getCnh() {
        return cnh;
    }

    public void setCnh(Cnh cnh) {
        this.cnh = cnh;
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


	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", email=" + email + "]";
	}
    
    
    //Adicionar esses métodos a classe main
    public void associarCnhAoUsuario(Cnh cnh) {
    	if (cnh==null) {
    		this.cnh = cnh;
		} else {
			System.out.println("O Usuario ja tem uma Cnh associada.");
		}
    	
    }
    
    public void associarVeiculoAoUsuario(Veiculo veiculo) {
    	this.veiculo = veiculo;
    	adicionarVeiculoPessoal(veiculo);
    }
    
    private static void adicionarVeiculoPessoal(Veiculo veiculo) {
        if (veiculosPessoais == null) {
        	veiculosPessoais = new Veiculo[1];
        } else {
            Veiculo[] novoVeiculosPessoais = new Veiculo[veiculosPessoais.length + 1];
            System.arraycopy(veiculosPessoais, 0, novoVeiculosPessoais, 0, veiculosPessoais.length);
            veiculosPessoais = novoVeiculosPessoais;
        }

        veiculosPessoais[veiculosPessoais.length - 1] = veiculo;
    }
    
    public void listarVeiculosPessoais(){
    	if (veiculosPessoais == null) {
			System.out.println("Nao ha veiculos cadastrados para este Usuario");
		}
    	else {
    		for (int i = 0; i < veiculosPessoais.length; i++){
    			System.out.println(i + " -> " + getVeiculosPessoais(i));
    		}
    	}
    	
}


}


