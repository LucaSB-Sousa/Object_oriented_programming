package negocio;

import dados.Dados;

public class Detran {
    //private Infracao infracao;
    private Cnh cnh;
    private static Dados dados = new Dados();

    public Detran(Dados dados) {
        Detran.dados = dados;
    }

    public Cnh getCnh() {
        return cnh;
    }

    public void setCnh(Cnh cnh) {
        this.cnh = cnh;
    }

    public void adicionarInfracaoAoUsuario(Usuario usuario, Infracao infracao) {

    }

    public void deletarUsuario(Usuario usuario) {

    }

    public void adicionarCnhAoUsuario(Usuario usuario, Cnh cnh) {
        if (usuario != null) {
            usuario.setCnh(cnh);
        }
    }

    public void removerCnhDoUsuario(Usuario usuario) {
        if (usuario != null) {
            usuario.setCnh(null);
        }
    }

    public void editarInfracao(String id, String novoTipo, int novoValor, int novaDataInfracao, String novoLocal, String novoStatus) {

    }

    public static Infracao cadastrarInfracao(String[] infracaoData) {
        return null;
    }
	
	/*public static void removerVeiculo(Veiculo veiculo,Usuario usuario) {
		int n = Usuario.getVeiculosPessoais().length;
		Veiculo[] vetor = Usuario.getVeiculosPessoais();
	    if (vetor != null && Usuario.getVeiculosPessoais().length > 0) {
	        int y = 0;
	        int posicao;
	        int x;
	        for (x = 0; x < n; x++) {
	            if (vetor[x].equals(veiculo)) {
	                y = 1;
	                posicao = x;
	                break;
	            }
	        }

	        if (y == 1) {
	            if (n > 1) {
	                Veiculo[] novoVetor = new Veiculo[n - 1];
	                int novoIndice = 0;
	                posicao = x;
	                for (int i = 0; i < n-1; i++) {
	                    if (i==posicao) {
	                        continue;
	                    } else {
	                        novoVetor[novoIndice] = vetor[i];
	                        novoIndice++;
	                    }
	                }
	                Usuario.setVeiculosPessoais(novoVetor);
	            } else {
	            	vetor = null; // Se há apenas um veículo, definir o vetor como nulo
	            }
	        } else {
	            System.out.println("Veiculo nao encontrado.");
	        }
	    } else {
	        System.out.println("Usuario nao tem veiculos associados.");
	    }
	}*/

}
